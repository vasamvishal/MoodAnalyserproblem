package com.dummyproject;

public class MoodAnalyserReal {

    private static String message;

    public MoodAnalyserReal(String message) {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Enter a value");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch(NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Enter a  proper value");
        }
    }
    public boolean equals(Object another) {
        if (another instanceof MoodAnalyserReal )
            return true;
        return false;
    }
}