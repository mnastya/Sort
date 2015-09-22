package start;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		bubbleSort();
		sumMatr();
	}

	public static void bubbleSort() {
		int[] numbers = { 8, 3, 1, 2, 6, 4 };
		for (int j = 0; j < (numbers.length - j); j++) {
			for (int i = 0; i < (numbers.length - 1); i++) {
				if (numbers[i] > numbers[i + 1]) {
					int a = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = a;
				}

			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static void sumMatr() {
		int sum = 0;
		int[][] matr = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += matr[i][j];
			}
		}
		System.out.println("\n" + sum);

	}

}
