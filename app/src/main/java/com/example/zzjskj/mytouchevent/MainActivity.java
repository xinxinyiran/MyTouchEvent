package com.example.zzjskj.mytouchevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.zzjskj.mytouchevent.widget.TouchButton;
import com.example.zzjskj.mytouchevent.widget.TouchFrameLayout;

public class MainActivity extends AppCompatActivity{
    
    private TouchButton btn;
    private TouchFrameLayout frameLayout;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        frameLayout=findViewById(R.id.frame_layout);
        
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TouchDemo", TAG+" onTouchEvent: ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("TouchDemo", TAG+" dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

}
