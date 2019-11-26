package com.dummyproject;

public class MoodAnalyserReal {

    private static String message;

    public MoodAnalyserReal(String message) {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch(NullPointerException e)
        {

            (MoodAnalysisException.ExceptionType.ENTERED_NULL,"Enter a  proper value");
        }
    }
}