package java.com.dev;

import java.util.Arrays;
import java.util.HashMap;

public class NumbersIntoWords extends NumToWord {
	public String convertNumIntoWords(int number) {
		String current;
		String numWords;
		int num_new = number;
		if (number % 100 < 20) {
			current = numNames[number % 100];
			number /= 100;

		} else {
			current = numNames[number % 10];
			System.out.println("current" + current);
			number /= 10;

			current = tensNames[number % 10] + current;
			number /= 10;
		}
		if (num_new > 100) {
			numWords = numNames[number] + " hundred" + current;
		} else {

			numWords = numNames[number] + current;
		}

		return numWords;
	}

}
