package by.academy.finish.task1;

public class CompressedStringNew {
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

		StringBuilder sb = new StringBuilder(str);
		int count = 1;

		int i = 0;

		while (i < str.length() - 1) {
			if (i == sb.length() - 1) {
				sb.append(count);
				break;
			} else if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.deleteCharAt(i + 1);
				count++;
				i--;
			} else if (sb.charAt(i) != sb.charAt(i + 1)) {
				sb.insert(i + 1, count);
				i++;
				count = 1;
			}
			i++;
		}

		if (sb.length() < str.length()) {
			return sb.toString();
		} else {
			return str;
		}
	}

}
