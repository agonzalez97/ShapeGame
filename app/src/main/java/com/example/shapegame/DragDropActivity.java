package com.example.shapegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragDropActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_drop);

        findViewById(R.id.myimage1).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage3).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage4).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.circulo).setOnDragListener(new MyDragListener(this));
        findViewById(R.id.rombo).setOnDragListener(new MyDragListener(this));
        findViewById(R.id.trapezi).setOnDragListener(new MyDragListener(this));
        findViewById(R.id.triangle).setOnDragListener(new MyDragListener(this));
    }
}
