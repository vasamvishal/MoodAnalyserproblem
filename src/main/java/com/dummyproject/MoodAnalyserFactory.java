package com.dummyproject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {
 private String message;
    public static MoodAnalyserReal creatMoodAnalyser(String message) throws ClassNotFoundException {
        try {
            Class<?> moodAnalyser= Class.forName("MoodAnalyserReal");
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
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException();
        }
        return null;
    }
}
