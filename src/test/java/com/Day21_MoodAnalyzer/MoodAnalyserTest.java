package com.Day21_MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

//Ability to analyse and respond Happy or Sad Mood

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyzeMood();
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyzeMood();
		Assert.assertEquals("Happy", mood);
	}

	@Test
	public void givenNullMood_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyzeMood();
		Assert.assertEquals("Happy", mood);
	}
}
