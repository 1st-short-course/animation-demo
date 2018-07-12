    package com.example.rany.animationsdemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

    public class SplashScreenDemo extends AppCompatActivity {

    @BindView(R.id.fram_container) FrameLayout frameLayout;
    @BindView(R.id.panda2) ImageView panda;
    @BindView(R.id.tvTitle) TextView tvTitle;

    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_demo);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);

        animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        frameLayout.startAnimation(animation);
        panda.startAnimation(animation);
        tvTitle.startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(SplashScreenDemo.this
                        , AnimationDemo.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

//        new Handler().postDelayed(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        Intent intent = new Intent(SplashScreenDemo.this
//                                , AnimationDemo.class);
//                        startActivity(intent);
//                    }
//                },
//                5000
//        );


    }
}
