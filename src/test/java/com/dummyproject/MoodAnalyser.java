package com.dummyproject;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser {


    @Test
    public void shouldReturn_SAD_ForSADmessage() throws MoodAnalysisException {

            MoodAnalyserReal moodAnalyserReal = new MoodAnalyserReal("this is a sad message");
            String mood = moodAnalyserReal.analyseMood();
            Assert.assertEquals("SAD", mood);
    }
    @Test

    public void shouldReturn_HAPPY_ForHappyMesssage() throws MoodAnalysisException {
        MoodAnalyserReal moodAnalyser = new MoodAnalyserReal("this is a happy message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test

    public void shouldReturn_Happy_forNull()  {
        try {
            MoodAnalyserReal moodAnalyserReal = new MoodAnalyserReal(null);
            String mood = moodAnalyserReal.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
        catch( MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void shouldReturn_customException_forNull(){

            MoodAnalyserReal moodAnalyserReal = new MoodAnalyserReal("");
            try {
                 moodAnalyserReal.analyseMood();
            }
        catch( MoodAnalysisException e ) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
            e.printStackTrace();
        }
    }
    @Test
    public void shouldReturn_object_fromClass() {
        try {
            MoodAnalyserReal moodobject = MoodAnalyserFactory.creatMoodAnalyser("im in a happy mood");

            String mood = moodobject.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
        catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }

        catch ( MoodAnalysisException e ) {
            e.printStackTrace();
        }

    }

}
