package me.amarpandey;

public class StringCalculator {

	public int add(final String input) {

		int result = 0;
		String negativeValues = "";
		int inputLength = input.length();

		if (inputLength == 0)
			result = 0;
		else if (inputLength == 1)
			result = cInt(input);
		else {
			String[] inputs = input.split("(,|\\n)");
			for (String value : inputs) {
				if (cInt(value) < 0) {
					if (negativeValues.length() == 0) {
						negativeValues += value;
					} else {
						negativeValues += "," + value;
					}
				} else {
					result += cInt(value) > 1000 ? 0 : cInt(value);
				}
			}
			if (negativeValues.length() > 0)
				throw new NumberFormatException(
						"negatives not allowed: " + negativeValues);
		}

		return result;
	}

	private int cInt(String input) {
		return Integer.parseInt(input);
	}

}
