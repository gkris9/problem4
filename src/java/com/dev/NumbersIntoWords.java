package java.com.dev;

public class NumbersIntoWords {

	public String convertNumIntoWords(int number) {
		String numToWord = "";
		for (WordToNum num : WordToNum.values()) {
			if (number == num.getNumber()) {
				numToWord = num.name();

			}

		}
		return numToWord;
	}

}
