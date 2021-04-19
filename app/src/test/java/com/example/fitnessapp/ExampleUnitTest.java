package com.example.fitnessapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculate_daily_calorie_intake calculate_daily_calorie_intake;
    private Daily_Calorie_Record daily_calorie_record;
    private InputsForCalorieIntake inputsForCalorieIntake;

    @Before
    public void setUpTest(){
        calculate_daily_calorie_intake = new Calculate_daily_calorie_intake();

        inputsForCalorieIntake = new InputsForCalorieIntake();

        //SetUpInputs
        inputsForCalorieIntake.setAge(32);
        inputsForCalorieIntake.setHeightInFeet(6);
        inputsForCalorieIntake.setHeightInInches(12);
        inputsForCalorieIntake.setWeight(91);
        inputsForCalorieIntake.setGender("Male");
        inputsForCalorieIntake.setActivityLevel("Sedentary");
        inputsForCalorieIntake.setTypeOfPerson("Fatty Person");

        //SetUpResults

    }

    @Test
    public void calculateCalorieIntake_isCorrect(){
        Daily_Calorie_Record daily_calorie_record = calculate_daily_calorie_intake.calculateCalorieIntakeinInsert(inputsForCalorieIntake);
        assertEquals(304,daily_calorie_record.getCarbIntake());
        assertEquals(2506,daily_calorie_record.getDailyCalorieIntake());
        assertEquals(70,daily_calorie_record.getFatIntake());
        assertEquals(166,daily_calorie_record.getProteinIntake());

    }
    
}