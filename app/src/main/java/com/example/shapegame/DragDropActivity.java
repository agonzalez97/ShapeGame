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
        findViewById(R.id.topleft).setOnDragListener(new MyDragListener(this));
        findViewById(R.id.topright).setOnDragListener(new MyDragListener(this));
        findViewById(R.id.bottomleft).setOnDragListener(new MyDragListener(this));
        findViewById(R.id.bottomright).setOnDragListener(new MyDragListener(this));
    }
}
