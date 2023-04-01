package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newSystem extends AppCompatActivity {

    private Button before2023GPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_system);
        // go to the next page of Old system
        before2023GPA = (Button) findViewById(R.id.before2023GPA);
        before2023GPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(newSystem.this, MainActivity.class));
                finish();
            }
        });
    }
}