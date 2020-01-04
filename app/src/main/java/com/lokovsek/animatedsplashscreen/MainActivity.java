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

    // Animations
    private Animation topAnimantion, bottomAnimation, middleAnimation, fromLeft, fromBottom, backToTop, toRight;
    private  static int TIME_OUT_1000 = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Animation Calls
        topAnimantion = AnimationUtils.loadAnimation(this, R.anim.from_top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);
        fromLeft = AnimationUtils.loadAnimation(this, R.anim.from_left_animation);
        fromBottom = AnimationUtils.loadAnimation(this, R.anim.from_bottom_animation);
        backToTop = AnimationUtils.loadAnimation(this, R.anim.back_to_top_animation);
        toRight = AnimationUtils.loadAnimation(this, R.anim.to_right_animation);

        //-----------Setting Animations to the elements of Splash Screen---------
        first.setAnimation(topAnimantion);
        second.setAnimation(topAnimantion);
        third.setAnimation(topAnimantion);
        fourth.setAnimation(topAnimantion);
        fifth.setAnimation(topAnimantion);
        sixth.setAnimation(topAnimantion);
        title.setAnimation(middleAnimation);
        subTitle.setAnimation(fromBottom);

        /// Close Screen
        new Handler().postDelayed(this::finish, TIME_OUT_1000 * 4);

    }
}
