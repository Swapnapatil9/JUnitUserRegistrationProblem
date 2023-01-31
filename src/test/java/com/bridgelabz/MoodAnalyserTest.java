package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood= moodAnalyser.analyseMood("This is a happy message");
        Assertions.assertEquals("happy",mood);
    }

}
