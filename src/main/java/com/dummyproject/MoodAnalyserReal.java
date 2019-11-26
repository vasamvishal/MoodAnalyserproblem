package com.dummyproject;

public class MoodAnalyserReal {

    private static String message;

    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";

        return null;
    }
}