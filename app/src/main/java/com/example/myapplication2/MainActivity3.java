package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button b;
    EditText t;
    EditText t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b=findViewById(R.id.button);
        t=findViewById(R.id.username);
        t2=findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t.getText().toString().isEmpty()||t2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "please enter both your credentials", Toast.LENGTH_SHORT).show();
                }else if(t.getText().toString().endsWith("@hospital.com")){Intent intent = new Intent(getApplicationContext(), Booking.class);
                    startActivity(intent);}
                else {
                    Toast.makeText(getApplicationContext(), "Incorrect Entry", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}