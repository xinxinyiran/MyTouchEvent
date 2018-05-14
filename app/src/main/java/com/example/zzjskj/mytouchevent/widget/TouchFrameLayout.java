package com.example.zzjskj.mytouchevent.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;


public class TouchFrameLayout extends FrameLayout {

    private static final String TAG = "TouchFrameLayout";
    
    public TouchFrameLayout(Context context){
        super(context);
    }
    
    public TouchFrameLayout(Context context, AttributeSet attrs){
        super(context,attrs);
    }
    
    public TouchFrameLayout(Context context,AttributeSet attrs,int defStyle){
        super(context,attrs,defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("TouchDemo", TAG+" dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TouchDemo", TAG+" onTouchEvent: ");
//        return super.onTouchEvent(event);
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        return super.onInterceptTouchEvent(ev);
        Log.i("TouchDemo", TAG+" onInterceptTouchEvent: ");
        return true;
    }
}
