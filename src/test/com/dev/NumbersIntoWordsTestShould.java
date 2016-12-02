package test.com.dev;

import java.com.dev.NumbersIntoWords;

import org.junit.Test;

import junit.framework.TestCase;

public class NumbersIntoWordsTestShould extends TestCase {

	@Test
	public void return_1_into_Words() {
		NumbersIntoWords numIntoWords = new NumbersIntoWords();
		assertEquals("zero", numIntoWords.convertNumIntoWords(0));
	}
}
