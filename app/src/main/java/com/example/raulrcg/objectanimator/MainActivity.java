package com.example.raulrcg.objectanimator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RelativeLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        canvas = (RelativeLayout) findViewById(R.id.animationCanvas);
    }

    public void onButtonClick(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

//        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", 0, targetY).setDuration(1000);
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", targetY,2).setDuration(1000);
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }
}
