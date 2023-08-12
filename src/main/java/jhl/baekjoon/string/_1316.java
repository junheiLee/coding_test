package jhl.baekjoon.string;

import java.util.Scanner;

public class _1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		String[] words = new String[n];

		for (int i = 0; i < n; i++) {
			words[i] = sc.nextLine();
		}

		char checkChar;
		int i = 0;
		int result = n;
		for (String word : words) {
			i = 0;

			while ((word.length() - 1) != i) {
				checkChar = word.charAt(i);

				if (word.charAt(i + 1) == checkChar) {
					word = word.replaceFirst("" + checkChar, "");
					continue;
				} else if (word.indexOf(checkChar, i + 1) == -1) {
					i++;
					continue;
				} else {
					result--;
					break;
				}
			}
		}
		System.out.println(result);

	}

}
