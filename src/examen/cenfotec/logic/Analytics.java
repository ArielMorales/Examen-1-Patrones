package examen.cenfotec.logic;

public class Analytics {

	public Analytics() {

	}

	public static int max(String word) {
		int max = 0;
		String[] splits = word.split(" ");
		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() >= max) {

				max = splits[i].length();
			}
		}
		return max;
	}

	public static int min(String word) {
		int max = 100;
		String[] splits = word.split(" ");
		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() <= max) {
				max = splits[i].length();
			}
		}
		return max;
	}

	public static int repetitions(int k, String word) {
		int quantity = 0;
		String[] splits = word.split(" ");
		for(int i = 0; i < splits.length; i++) {
			if(splits[i].length() == k) {
				quantity += 1;
			}
		}
		return quantity;

	}

	public static String[] masLarga(String word) {
		int counter = 0;
		String[] result = new String[repetitions(max(word), word)];
		String[] splits = word.split(" ");
		for(int i = 0; i < splits.length; i++) {
			if(splits[i].length() == max(word)) {
				result[counter] = splits[i];
				counter++;
			}
		}
		return result;
	}
}
