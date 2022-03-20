package com.Day21_MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = null;
		mood = moodAnalyser.analyzeMood();
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyzeMood();
			Assert.assertEquals("Happy", mood);
		} catch (MoodAnalysisException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenNullMood_ShouldReturnHappy() {
		String mood = null;
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			mood = moodAnalyser.analyzeMood();
			Assert.assertEquals("Happy", mood);
		} catch (MoodAnalysisException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmptyMood_ShouldReturnHappy() {
		String mood = null;
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			mood = moodAnalyser.analyzeMood();
			Assert.assertEquals("Happy", mood);
		} catch (MoodAnalysisException e) {
			System.out.println(e);
		}
	}
}
