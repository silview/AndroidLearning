package com.silview.androidlearning;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ListenerActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener,View.OnKeyListener,View.OnFocusChangeListener{

    private Button mbutton1;
    private Button mbutton2;
    private Button mbutton3;
    private Button mbutton4;
    private int value = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_listener);

        mbutton1 = findViewById(R.id.buttonCheckBox);
        mbutton1.setOnClickListener(this);
        mbutton1.setOnTouchListener(this);
        mbutton1.setOnKeyListener(this);
        mbutton1.setOnFocusChangeListener(this);

        mbutton2 = findViewById(R.id.button2);

        mbutton3 = findViewById(R.id.button3);

        mbutton4 = findViewById(R.id.button4);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button)v;
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        if (value == 1 && button.getWidth() >= size.x ){
            value = -1;
        }
        else if (value == -1 && button.getWidth() < 150){
            value = 1;
        }
        button.setWidth(button.getWidth() + (int)(button.getWidth()*0.1)*value);
        button.setHeight(button.getHeight() + (int)(button.getHeight()*0.1)*value);

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus){
            mbutton1.setText("获得焦点");
        }
        else {
            mbutton1.setText("失去焦点");
        }
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_UP){
            v.setBackgroundResource(R.drawable.ic_star_black_24dp);
        }
        else if (event.getAction() == KeyEvent.ACTION_DOWN){
            v.setBackgroundResource(R.drawable.ic_star_border_black_24dp);
        }
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP){
            v.setBackgroundResource(R.drawable.ic_star_black_24dp);
        }
        else if (event.getAction() == MotionEvent.ACTION_DOWN){
            v.setBackgroundResource(R.drawable.ic_star_border_black_24dp);
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
