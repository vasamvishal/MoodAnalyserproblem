package com.dummyproject;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser {
    @Test
    public void shouldReturn_SAD_ForSADmessage() {
        MoodAnalyserReal moodAnalyserReal = new MoodAnalyserReal();
        String mood = moodAnalyserReal.analyseMood("this is a sad message");
        Assert.assertEquals("SAD",mood);
    }


}
