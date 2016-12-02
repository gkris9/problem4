package test.com.dev;

import java.com.dev.NumbersIntoWords;

import org.junit.Test;

import junit.framework.TestCase;

public class NumbersIntoWordsTestShould extends TestCase {

	@Test
	public void return_1_into_Words() {
		NumbersIntoWords numIntoWords = new NumbersIntoWords();
		assertEquals("One", numIntoWords.convertNumIntoWords(1));
	}
	
	@Test
	public void return_2_into_Words() {
		NumbersIntoWords numIntoWords = new NumbersIntoWords();
		assertEquals("Two", numIntoWords.convertNumIntoWords(2));
	}
}
