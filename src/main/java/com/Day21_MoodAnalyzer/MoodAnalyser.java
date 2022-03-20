package com.Day21_MoodAnalyzer;

public class MoodAnalyser {

	public String analyseMood(String msg) {
		if (msg.contains("Sad")) {
			return "Sad";
		}
		return "Happy";
	}
}
