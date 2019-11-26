package com.dummyproject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {
 private String message;
    public static MoodAnalyserReal creatMoodAnalyser(String message) throws  MoodAnalysisException {
        try {
            Class<?> moodAnalyser= Class.forName("com.dummyproject.MoodAnalyserReal");
            try {
                Constructor<?> moodConstructor = moodAnalyser.getConstructor(String.class);
                try {
                    Object moodobj = moodConstructor.newInstance(message);
                    return (MoodAnalyserReal)moodobj;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,"ENTER PROPER METHOD");
            }
        } catch (ClassNotFoundException e) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,"ENTER PROPER CLASS");
        }
        return null;
    }
}
