package com.example.shapegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragDropActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_drop);

        findViewById(R.id.triangulo2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.rombo2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.trapezi2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.circulo2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.circulo).setOnDragListener(new MyDragListener(this,"circulo"));
        findViewById(R.id.rombo).setOnDragListener(new MyDragListener(this,"rombo"));
        findViewById(R.id.trapezi).setOnDragListener(new MyDragListener(this,"trapezi"));
        findViewById(R.id.triangle).setOnDragListener(new MyDragListener(this,"triangle"));
    }
}
