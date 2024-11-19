package com.example.mbplz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<User> arrayList;
    private Context context;

    public CustomAdapter(ArrayList<User> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }





    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        CustomViewHolder holder=new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getProfile())
                .into(holder.iv_profile);
        holder.tv_id.setText(arrayList.get(position).getId());
        holder.tv_st.setText(String.valueOf(arrayList.get(position).getSt()));
        holder.tv_Hr.setText(String.valueOf(arrayList.get(position).getHr()));

        holder.frame_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res = new Intent(context, three.class);
                ((second)context).startActivity(res);
            }
        });

    }

    @Override
    public int getItemCount() {
        return (arrayList!=null?arrayList.size():0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_profile;
        TextView tv_id;
        TextView tv_st;
        TextView tv_Hr;
        FrameLayout frame_Layout;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_profile= itemView.findViewById(R.id.iv_profile);
            this.tv_id=itemView.findViewById(R.id.tv_id);
            this.tv_st=itemView.findViewById(R.id.tv_st);
            this.tv_Hr=itemView.findViewById(R.id.tv_Hr);
            this.frame_Layout=itemView.findViewById(R.id.first1);
        }
    }

}
