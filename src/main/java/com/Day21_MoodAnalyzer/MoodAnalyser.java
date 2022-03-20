package com.Day21_MoodAnalyzer;

public class MoodAnalyser {

	private String msg;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg){
        this.msg = msg;
    }

    public String analyzeMood() {
        if(msg.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}
