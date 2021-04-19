package com.example.fitnessapp;


import android.content.ComponentName;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.InstrumentationRegistry.getTargetContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class CalorieIntakeInstrumentedTest{

    @Rule
    public ActivityScenarioRule<Calculate_daily_calorie_intake> calculate_daily_calorie_intake=
            new ActivityScenarioRule<>(Calculate_daily_calorie_intake.class);


    @Test
    public void test_isAvtivityInView() {
        onView(withId(R.id.main_tool_bar)).check(matches(isDisplayed()));
        onView(withId(R.id.cardView)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_Age_Calorie)).check(matches(isDisplayed()));
        onView(withId(R.id.et_age_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_Gender_Calorie)).check(matches(isDisplayed()));
        onView(withId(R.id.sp_gender_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_Height_Calorie)).check(matches(isDisplayed()));
        onView(withId(R.id.et_height_feet_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.et_height_inches_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_weight_calorie)).check(matches(isDisplayed()));
        onView(withId(R.id.et_weight_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_activity_calorie)).check(matches(isDisplayed()));
        onView(withId(R.id.sp_activity_level_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_type_of_person)).check(matches(isDisplayed()));
        onView(withId(R.id.sp_type_of_person_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.bt_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.bottomNavigationView)).check(matches(isDisplayed()));

    }

    @Test
    public void CalorieIntakeFunctionTest(){
        /*Intents.init();*/
        onView(withId(R.id.bt_calorie_calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.bt_calorie_calculate)).perform(click());
        onView(withId(R.id.resultsLinearLayout)).check(matches(isDisplayed()));


    }
}
