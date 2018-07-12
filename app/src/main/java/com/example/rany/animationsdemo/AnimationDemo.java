package com.example.rany.animationsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationDemo extends AppCompatActivity {

    @BindView(R.id.imvPanda) ImageView imvPanda;
    //ImageView imvPandas;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_demo);
        // important point
        ButterKnife.bind(this);

        //initView();
    }
//    void initView(){
//        imvPandas = findViewById(R.id.imvPanda);
//    }

    @OnClick(R.id.btnShow)
    public void onShowImage(){
        animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imvPanda.startAnimation(animation);
    }

    @OnClick(R.id.btnHide)
    public void onHideImage(){
        animation = AnimationUtils.loadAnimation(AnimationDemo.this, R.anim.fade_out);
        imvPanda.startAnimation(animation);
    }

    @OnClick(R.id.btnZoomIn)
    public void onZoomInImage(){
        animation = AnimationUtils.loadAnimation(AnimationDemo.this, R.anim.zoom_in);
        animation.setInterpolator(new BounceInterpolator());
        imvPanda.startAnimation(animation);
    }

    @OnClick(R.id.btnZoomOut)
    public void onZoomOutImage(){
        animation = AnimationUtils.loadAnimation(AnimationDemo.this, R.anim.zoom_out);
        animation.setInterpolator(new BounceInterpolator());
        imvPanda.startAnimation(animation);
    }

    @OnClick(R.id.btnRotate)
    public void onRotateImage(){
        animation = AnimationUtils.loadAnimation(AnimationDemo.this, R.anim.rotate);
        imvPanda.startAnimation(animation);
    }

    @OnClick(R.id.btnMove)
    public void onMove(){
        animation = AnimationUtils.loadAnimation(AnimationDemo.this, R.anim.translate);
        imvPanda.startAnimation(animation);
    }

}
