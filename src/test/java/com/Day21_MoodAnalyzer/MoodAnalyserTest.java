package com.Day21_MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

//Ability to analyse and respond Happy or Sad Mood

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", mood);
	}

}
