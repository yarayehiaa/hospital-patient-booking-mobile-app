package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
     Button b;
    EditText t;
    EditText t1;
    EditText t2;
    EditText t3;
    EditText t4;
    EditText t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        b= findViewById(R.id.button2);
        t=findViewById(R.id.editTextTextPersonName);
        t1=findViewById(R.id.editTextTextEmailAddress);
        t2=findViewById(R.id.editTextPhone);
        t3=findViewById(R.id.editTextTextPersonName2);
        t4=findViewById(R.id.editTextTextPersonName3);
        t5= findViewById(R.id.editTextTextPassword);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t.getText().toString().isEmpty()||t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty()||t4.getText().toString().isEmpty()||t5.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "please fill all the text fields", Toast.LENGTH_SHORT).show();
                }else{Intent intent = new Intent(getApplicationContext(), Booking.class);
                    startActivity(intent);}
            }
        });
    }
}