package com.test.worldskilsbank;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout button1 = findViewById(R.id.button_otdel);
        View.OnTouchListener st = new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent event)
            {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    Intent intent = new Intent(MainActivity.this,otdel.class);
                    startActivity(intent);
                }
                return true;
            }

        };
        button1.setOnTouchListener(st);

        RelativeLayout button2 = findViewById(R.id.button_kyrs);
        View.OnTouchListener st2 = new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent event)
            {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    Intent intent = new Intent(MainActivity.this,kyrs.class);
                    startActivity(intent);
                }
                return true;
            }

        };
        button2.setOnTouchListener(st2);

        Button button3 = findViewById(R.id.vxod);
        View.OnTouchListener st3 = new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent event)
            {
                if (event.getAction()==MotionEvent.ACTION_DOWN){

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Введите ваш логин и пароль")
                            .setView(R.layout.dialog_signin)
                            .setPositiveButton("Войти", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.setTitle("Авторизация");
                    alert.show();




                }
                return true;
            }

        };
        button3.setOnTouchListener(st3);
    }

    public boolean onTouch(View view, MotionEvent event)
    {
        return true;
    }
}