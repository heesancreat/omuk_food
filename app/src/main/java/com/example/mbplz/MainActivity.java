package com.example.mbplz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_MBplz);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton2);
            imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),second.class);
                startActivity(intent);}

        }
        );

        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),secondys.class);
                startActivity(intent1);
            }
        });
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),secondg.class);
                startActivity(intent2);
            }
        });


    }
}