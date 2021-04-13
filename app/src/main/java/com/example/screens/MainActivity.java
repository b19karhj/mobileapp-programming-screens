package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.open_second_activity);
        button.setOnClickListener(new View.OnClickListener() { //sätter en listener på knappen.
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, SecondActivity.class); //bestämmer vad som ska hända efter knappen är tryckt.
                intent.putExtra("name", "HEJ!!!");
                startActivity(intent);


            }
        });




    }




}


