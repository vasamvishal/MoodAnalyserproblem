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
    public void shouldReturn_exception_fromWrongClass() {
        try {
            MoodAnalyserReal moodobject = MoodAnalyserFactory.creatMoodAnalyser("i am in happy mood");
            String mood = moodobject.analyseMood();
        }

        catch ( MoodAnalysisException e ) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,e.type);
            e.printStackTrace();
        }
    }
    @Test

    public void shouldReturn_exceptionFor_Wrongconstructorname() {
        try {
            MoodAnalyserReal moodobject = MoodAnalyserFactory.creatMoodAnalyser("i am in happy mood");
            String mood = moodobject.analyseMood();

        }
        catch(MoodAnalysisException e ){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,e.type);

            e.printStackTrace();
        }

    }
}
