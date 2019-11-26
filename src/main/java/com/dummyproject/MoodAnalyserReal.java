package com.dummyproject;

public class MoodAnalyserReal {

    private static String message;

    public MoodAnalyserReal(String message) {
        this.message=message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}