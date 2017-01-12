package com.example.heitorcolangelo.espressotests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.heitorcolangelo.espressotests.ui.activity.UserDetailsActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class UserDetailsActivityTest {

    @Rule
    public ActivityTestRule<UserDetailsActivity>
            mActivityRule = new ActivityTestRule<UserDetailsActivity>(UserDetailsActivity.class, false, false);


    @Test
    public void checkCommonViews(){
        mActivityRule.launchActivity(createIntent(false));
    }
}
