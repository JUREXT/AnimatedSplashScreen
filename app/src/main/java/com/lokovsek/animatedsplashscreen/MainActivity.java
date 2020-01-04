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

    @BindView(R.id.first_line) View mFirstView;
    @BindView(R.id.second_line) View mSecondView;
    @BindView(R.id.third_line) View mThirdView;
    @BindView(R.id.fourth_line) View mFourthView;
    @BindView(R.id.fifth_line) View mFifthView;
    @BindView(R.id.sixth_line) View mSixthView;
    @BindView(R.id.title) TextView mTitle;
    @BindView(R.id.sub_title) TextView mSubTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Animation Calls
        Animation mFromTopAnimantion = AnimationUtils.loadAnimation(this, R.anim.from_top_animation);
        Animation mBottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        Animation mMiddleFromLeftAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);
        Animation mFromLeftAnimation = AnimationUtils.loadAnimation(this, R.anim.from_left_animation);
        Animation mFromBottomAnimation = AnimationUtils.loadAnimation(this, R.anim.from_bottom_animation);
        Animation mBackToTopAnimation = AnimationUtils.loadAnimation(this, R.anim.back_to_top_animation);
        Animation mToRightAnimation = AnimationUtils.loadAnimation(this, R.anim.to_right_animation);

        // Setting Animations to the elements of Splash Screen
        mFirstView.setAnimation(mFromTopAnimantion);
        mSecondView.setAnimation(mFromTopAnimantion);
        mThirdView.setAnimation(mFromTopAnimantion);
        mFourthView.setAnimation(mFromTopAnimantion);
        mFifthView.setAnimation(mFromTopAnimantion);
        mSixthView.setAnimation(mFromTopAnimantion);

        mTitle.setAnimation(mMiddleFromLeftAnimation);
        mSubTitle.setAnimation(mFromBottomAnimation);

        /// Close Screen
        new Handler().postDelayed(this::finish, 1000 * 4);

    }
}
