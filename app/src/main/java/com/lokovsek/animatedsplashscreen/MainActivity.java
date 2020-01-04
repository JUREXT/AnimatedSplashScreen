package com.lokovsek.animatedsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.first_line) View first;
    @BindView(R.id.second_line) View second;
    @BindView(R.id.third_line) View third;
    @BindView(R.id.fourth_line) View fourth;
    @BindView(R.id.fifth_line) View fifth;
    @BindView(R.id.sixth_line) View sixth;
    @BindView(R.id.title) TextView title;
    @BindView(R.id.sub_title) TextView subTitle;

    //Animations
    private Animation topAnimantion, bottomAnimation, middleAnimation;
    private  static int TIME_OUT_1000 = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Animation Calls
        topAnimantion = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        //-----------Setting Animations to the elements of Splash Screen---------
        first.setAnimation(topAnimantion);
        second.setAnimation(topAnimantion);
        third.setAnimation(topAnimantion);
        fourth.setAnimation(topAnimantion);
        fifth.setAnimation(topAnimantion);
        sixth.setAnimation(topAnimantion);

        title.setAnimation(middleAnimation);
        subTitle.setAnimation(bottomAnimation);

        ///
        //Splash Screen Code to call new Activity after some time
        new Handler().postDelayed(this::finish, TIME_OUT_1000 * 5);

    }
}
