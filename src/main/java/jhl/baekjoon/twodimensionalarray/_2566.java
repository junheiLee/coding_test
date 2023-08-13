package jhl.baekjoon.twodimensionalarray;

import java.util.Scanner;

public class _2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] findMaxBoard = new int[9][9];
		int[] maxInfo = { 0, 0, 0 };
		int num = 0;

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				num = sc.nextInt();
				findMaxBoard[i][j] = num;
				if (num >= maxInfo[0]) {
					maxInfo[0] = num;
					maxInfo[1] = i + 1;
					maxInfo[2] = j + 1;
				}
			}
		}

		System.out.print(maxInfo[0] + "\n" + maxInfo[1] + " " + maxInfo[2]);
	}

}
