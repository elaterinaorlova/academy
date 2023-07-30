package by.academy.homework5.task5;

import java.util.HashMap;
import java.util.Map;

public class DictionaryMap {

	public static void main(String[] args) {
		String string = new String(
				"The most important thing is to enjoy your life - to be happy - it's all that matters.");

		string = string.toLowerCase();

		Map<Character, Integer> dictionaryMap = new HashMap<>();
		char[] chars = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			int v = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] != '\u0000' && chars[i] == chars[j]) {
					v++;
					chars[j] = '\u0000';

				}
			}
			if (chars[i] != '\u0000') {
				dictionaryMap.put(chars[i], v);

			}
		}
		System.out.println(dictionaryMap);
	}
}
