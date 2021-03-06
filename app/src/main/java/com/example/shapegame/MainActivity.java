package com.example.shapegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.dragdrop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dragDropActivity = new Intent(MainActivity.this, DragDropActivity.class);
                startActivity(dragDropActivity);
            }
        });
    }
}
