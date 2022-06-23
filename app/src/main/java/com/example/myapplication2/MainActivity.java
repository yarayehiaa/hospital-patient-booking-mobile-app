package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {
    Button btn;
   // TextView text, errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn3);
       // text = (TextView) findViewById(R.id.textView7);
       // errorText = (TextView) findViewById(R.id.textView8);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
               // new Async().execute();

            }
        });

    }

    /*class Async extends AsyncTask<Void, Void, Void> {


        String records = "", error = "";

        @Override

        protected Void doInBackground(Void... voids) {

            try {

                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.2/jdbctest:3306", "root", "Nashwa123412");

                Statement statement = con.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM surgerysalary");

                while (resultSet.next()) {

                    records += resultSet.getString(1) + " " + resultSet.getString(2) + "\n";

                }

            } catch (Exception e) {

                error = e.toString();

            }

            return null;

        }


        @Override

        protected void onPostExecute(Void aVoid) {

            text.setText(records);

            if (error != "")

                errorText.setText(error);

            super.onPostExecute(aVoid);

        }


    }*/
}