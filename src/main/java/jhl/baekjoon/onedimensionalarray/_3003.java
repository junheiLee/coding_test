package jhl.baekjoon.onedimensionalarray;

import java.util.Scanner;

public class _3003 {
	public static final int[] CHESS_PINS = { 1, 1, 2, 2, 2, 8 };
	public static final int CHESS_PIN_NUM = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 0;

		for (int i = 0; i < CHESS_PIN_NUM; i++) {
			pin = sc.nextInt();
			System.out.print(CHESS_PINS[i] - pin + " ");
		}
	}

}
