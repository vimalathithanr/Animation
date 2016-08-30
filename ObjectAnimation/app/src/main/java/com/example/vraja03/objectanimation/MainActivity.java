package com.example.vraja03.objectanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAnimation = (Button) findViewById(R.id.btnAnimate);
        btnAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                // This starts and run parallely
                ObjectAnimator moveToTop = ObjectAnimator.ofFloat(view, "y", 40);
                //USE VIEW.CONSTANTS so that getter and setter methods can be avoided.
                moveToTop.setDuration(2500);
                moveToTop.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        //super.onAnimationEnd(animation);
                        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(view, "alpha", 0);
                        fadeOut.start();
                    }
                });
                moveToTop.start();
            }
        });
    }
}
