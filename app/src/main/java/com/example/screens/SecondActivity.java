package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.text_id);

        Bundle extras = getIntent().getExtras();        //Sammlar getintent.getextras om intent inte är tom så skickas strängen namne.
        if (extras != null) {
            String name = extras.getString("name");
            textView.setText(name);

        }

        Button close = findViewById(R.id.close_second_activity);   //Kallar på id
        close.setOnClickListener(new View.OnClickListener() { // Sätter on onclick listner som lyssnar på knappen.
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}