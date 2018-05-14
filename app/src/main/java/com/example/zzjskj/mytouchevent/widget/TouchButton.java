package com.example.zzjskj.mytouchevent.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.widget.Button;


public class TouchButton extends AppCompatButton {

    private static final String TAG = "TouchButton";
    
    public TouchButton(Context context){
        super(context);
    }
    
    public TouchButton(Context context, AttributeSet attrs){
        super(context,attrs);
    }
    
    public TouchButton(Context context,AttributeSet attrs,int defStyle){
        super(context,attrs,defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("TouchDemo", TAG+" dispatchTouchEvent: ");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TouchDemo", TAG+" onTouchEvent: ");
        return super.onTouchEvent(event);
//        return false;
    }

}
