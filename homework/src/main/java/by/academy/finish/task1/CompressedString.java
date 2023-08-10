package by.academy.finish.task1;

public class CompressedString {

	public static void main(String[] args) {
		String string1 = "ааbсссссааа";
		String string1C = compressedString(string1);
		String string2 = "dsfla";
		String string2C = compressedString(string2);

		System.out.println("String before compression: " + string1);
		System.out.println("String after compression: " + string1C);
		System.out.println("String before compression: " + string2);
		System.out.println("String after compression: " + string2C);

	}

	public static String compressedString(String str) {
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}
		char[] array = new char[size];
		int index = 0;
		char c = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			} else {
				index = setChar(str, array, c, index, count);
				c = str.charAt(i);
				count = 1;
			}
		}

		index = setChar(str, array, c, index, count);
		return String.valueOf(array);
	}

	public static int setChar(String str, char[] array, char c, int index, int count) {
		array[index] = c;
		index++;
		char[] chars = String.valueOf(count).toCharArray();
		for (char х : chars) {
			array[index] = х;
			index++;
		}
		return index;
	}

	public static int countCompression(String str) {
		char c = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			} else {
				c = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
}
