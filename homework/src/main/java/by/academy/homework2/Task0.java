package by.academy.homework2;

import java.util.Scanner;

public class Task0 {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		k = sc.nextInt();

		arr = new int[n];
		System.out.println(arr);
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(arr[i] - arr[j]) == k)
					pairsCount++;
			}
		}
		sc.close();
		return pairsCount;
	}
}