package com.jamillabltd.layoutinflaterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToNext = findViewById(R.id.goToNextId);
        goToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NextCode.class);
                startActivity(intent);
            }
        });

        LinearLayout inflateWithJava = findViewById(R.id.inflateWithJavaId);

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //layoutInflater.inflate(R.layout.layout_two, inflateWithJava);
        View view = layoutInflater.inflate(R.layout.layout_two, inflateWithJava);

        //inflate with xml
        Button buttonOne = findViewById(R.id.buttonOneId);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 1", Toast.LENGTH_SHORT).show();
            }
        });

        //inflate with java
        Button button2 = view.findViewById(R.id.buttonTwoId);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 2", Toast.LENGTH_SHORT).show();
            }
        });

        //for java best practice
        Button button3 = view.findViewById(R.id.buttonThreeId);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 3", Toast.LENGTH_SHORT).show();
            }
        });

        //remove inflate value onclick to
        Button removeValue = findViewById(R.id.removeValueId);
        removeValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inflateWithJava.removeAllViews();
            }
        });

        //view inflate again
        Button viewAgain = findViewById(R.id.viewAgainId);
        viewAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutInflater.inflate(R.layout.layout_two, inflateWithJava);
            }
        });



    }

}