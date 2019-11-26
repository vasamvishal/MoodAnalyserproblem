package com.dummyproject;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser {


    @Test
    public void shouldReturn_SAD_ForSADmessage() {
        MoodAnalyserReal moodAnalyserReal = new MoodAnalyserReal("this is a sad message");
        String mood = moodAnalyserReal.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
    @Test

    public void shouldReturn_HAPPY_ForHappyMesssage() {
        MoodAnalyserReal moodAnalyser = new MoodAnalyserReal("this is a happy message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test

    public void shouldReturn_Happy_forNull() {
        MoodAnalyserReal moodAnalyserReal = new MoodAnalyserReal(null);
        String mood = moodAnalyserReal.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
