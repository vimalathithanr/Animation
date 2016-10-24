package com.example.vraja03.fadein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvFirstName = (TextView) findViewById(R.id.tvFirstName);
        TextView tvLastName = (TextView) findViewById(R.id.tvLastName);
        ImageView ivLogo = (ImageView) findViewById(R.id.ivUniversityLogo);
        ImageView ivBtownLogo = (ImageView) findViewById(R.id.ivBloomingtonLogo);

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation moveUp = AnimationUtils.loadAnimation(this, R.anim.move_up);
        Animation zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        tvFirstName.setAnimation(fadeIn);
        tvLastName.setAnimation(moveUp);
        ivLogo.setAnimation(zoomIn);
        ivBtownLogo.setAnimation(rotate);
    }
}
