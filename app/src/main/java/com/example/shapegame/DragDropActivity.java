package com.example.shapegame;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragDropActivity extends AppCompatActivity {

    Figura f1,f2,f3,f4,f5,f6,f7,f8;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int random = (int) (Math.random() * 2 + 1);

        f1 = new Figura();
        f2 = new Figura();
        f3 = new Figura();
        f4 = new Figura();
        f5 = new Figura();
        f6 = new Figura();
        f7 = new Figura();
        f8 = new Figura();


        if(random == 1){
            setContentView(R.layout.activity_drag_drop);
            f1.imageView = findViewById(R.id.triangulo2);
            f1.imageView.setOnTouchListener(new MyTouchListener());
            f2.imageView = findViewById(R.id.rombo2);
            f2.imageView.setOnTouchListener(new MyTouchListener());
            f3.imageView = findViewById(R.id.trapezi2);
            f3.imageView.setOnTouchListener(new MyTouchListener());
            f4.imageView = findViewById(R.id.circulo2);
            f4.imageView.setOnTouchListener(new MyTouchListener());

            f5.imageView = findViewById(R.id.circulo);
            f5.imageView.setOnDragListener(new MyDragListener(this,"circulo"));
            f6.imageView.findViewById(R.id.triangle);
            f6.imageView.setOnDragListener(new MyDragListener(this,"triangle"));
            f7.imageView = findViewById(R.id.trapezi);
            f7.imageView.setOnDragListener(new MyDragListener(this,"trapezi"));
            f8.imageView = findViewById(R.id.rombo);
            f8.imageView.setOnDragListener(new MyDragListener(this,"rombo"));



        } else if( random == 2){
            setContentView(R.layout.activity_drag_drop2);
            findViewById(R.id.rombo2).setOnTouchListener(new MyTouchListener());
            findViewById(R.id.trapezi2).setOnTouchListener(new MyTouchListener());
            findViewById(R.id.cuadrado2).setOnTouchListener(new MyTouchListener());
            findViewById(R.id.rectangulo2).setOnTouchListener(new MyTouchListener());

            findViewById(R.id.rombo).setOnDragListener(new MyDragListener(this,"rombo"));
            findViewById(R.id.trapezi).setOnDragListener(new MyDragListener(this,"trapezi"));
            findViewById(R.id.cuadrado).setOnDragListener(new MyDragListener(this,"cuadrado"));
            findViewById(R.id.rectangulo).setOnDragListener(new MyDragListener(this,"rectangulo"));
        }


    }

//    void Sorieketon(Figura f1,Figura f2){
   //     if(f1.imageView.getBackground().getConstantState() == f2.imageView.getBackground().getConstantState()){
   //         cara
  //      }else{
    //        volver
 //       }
 //   }

}
