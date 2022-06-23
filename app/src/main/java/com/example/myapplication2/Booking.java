package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Booking extends AppCompatActivity {
Button b;
    Button b1;
    Button b2;
    Button b3;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        b=findViewById(R.id.button3);
        b1=findViewById(R.id.button4);
        b2=findViewById(R.id.button5);
        b3=findViewById(R.id.button6);
        b4=findViewById(R.id.button7);

           b.setOnClickListener((View.OnClickListener) v -> {
               Intent intent = new Intent(getApplicationContext(),patientdata.class);
               startActivity(intent);

           });
       b1.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(getApplicationContext(),patientdata.class);
            startActivity(intent);

        });
        b2.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(getApplicationContext(),patientdata.class);
            startActivity(intent);

        });
        b3.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(getApplicationContext(),patientdata.class);
            startActivity(intent);

        });
        b4.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(getApplicationContext(),patientdata.class);
            startActivity(intent);

        });

        }
    }

