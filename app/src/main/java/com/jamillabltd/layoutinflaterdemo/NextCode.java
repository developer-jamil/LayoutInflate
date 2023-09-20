package com.jamillabltd.layoutinflaterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class NextCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_code);

        // Find the LinearLayout in your main layout where you want to inflate "layout_two.xml"
        LinearLayout linearLayout = findViewById(R.id.inflateHereId);

        // Inflate "layout_two.xml" and add it to the LinearLayout
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_two, null);
        linearLayout.addView(view);


        // Find Button 2 and set OnClickListener
        Button button2 = view.findViewById(R.id.buttonTwoId);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when Button 2 is clicked
                Toast.makeText(getApplicationContext(), "Button 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Find Button 3 and set OnClickListener
        Button button3 = view.findViewById(R.id.buttonThreeId);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when Button 3 is clicked
                Toast.makeText(getApplicationContext(), "Button 3 clicked", Toast.LENGTH_SHORT).show();
            }
        });



    }
}