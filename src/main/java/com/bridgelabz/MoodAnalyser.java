package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if(message.contains("sad")){
            return "Test cases fails the entry";
        }else {
            return "Test case validates the entry successfully";
        }
    }
}
