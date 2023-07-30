package by.academy.homework5.task6;

import java.util.Arrays;

public class ArrayTryCatch {

	public static void main(String[] args) {
		int[] array = new int[8];
		for (int i = 0; i < 10; i++) {
			try {
				array[i] = i;
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Array length is \"8\", you can't add more elements");
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
