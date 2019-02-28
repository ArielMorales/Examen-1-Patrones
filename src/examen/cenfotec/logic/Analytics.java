package examen.cenfotec.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() == k) {
				quantity += 1;
			}
		}
		return quantity;

	}

	public static String[] masLarga(String word) {
		int counter = 0;
		String[] result = new String[repetitions(max(word), word)];
		String[] splits = word.split(" ");
		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() == max(word)) {
				result[counter] = splits[i];
				counter++;
			}
		}

		List<String> listResult = new ArrayList<String>();

		listResult = Arrays.asList(result);

		Collections.sort(listResult);

		listResult.toArray(result);

		return result;
	}

	public static String[] masCorta(String word) {
		int counter = 0;
		String[] result = new String[repetitions(min(word), word)];
		String[] splits = word.split(" ");
		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() == min(word)) {
				result[counter] = splits[i];
				counter++;
			}
		}
		
		List<String> listResult = new ArrayList<String>();

		listResult = Arrays.asList(result);

		Collections.sort(listResult);

		listResult.toArray(result);
		return result;
	}

	public static String primeroMasLarga(String word) {
		String result = "";
		String[] splits = word.split(" ");
		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() == max(word)) {
				result = splits[i];
				break;
			}
		}
		return result;
	}
}
