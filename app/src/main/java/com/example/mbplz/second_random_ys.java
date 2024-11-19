package com.example.mbplz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class second_random_ys extends AppCompatActivity {

    int[] image = new int[] {R.drawable._1,R.drawable._5,R.drawable._st3,R.drawable._st4
            ,R.drawable._st6};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_radom_ys);

        ImageView mImageView = (ImageView)findViewById(R.id.Random_Img);
        ImageButton Button1 =(ImageButton) findViewById(R.id.NT_Button);
        int imageId = (int)(Math.random() * image.length);
        mImageView.setBackgroundResource(image[imageId]);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = (int)(Math.random() * image.length);
                mImageView.setBackgroundResource(image[imageId]);
            }
        });

    }
}
