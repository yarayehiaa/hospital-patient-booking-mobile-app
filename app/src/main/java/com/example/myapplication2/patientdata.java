package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class patientdata extends AppCompatActivity {

    EditText t;
    CheckBox y;
    CheckBox n;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdata);
        t = findViewById(R.id.editTextTextMultiLine);
        y = findViewById(R.id.checkBox);
        n = findViewById(R.id.checkBox2);
        b = findViewById(R.id.button8);
     y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             n.setEnabled(false);
         }
     });
        n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                y.setEnabled(false);
            }
        });

        b = findViewById(R.id.button8);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((t.getText().toString().isEmpty())) {

                    Toast.makeText(getApplicationContext(), "Booking Unsuccessful,please fill fields properly", Toast.LENGTH_SHORT).show();

                } else {


                    Toast.makeText(getApplicationContext(), "Booking Successful,our representative will contact you soon", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }
}