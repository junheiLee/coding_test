package jhl.baekjoon.string;

import java.util.Scanner;

public class _2941 {

	public static void main(String[] args) {

		final String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		Scanner sc = new Scanner(System.in);
		String changedWord = sc.nextLine();
		
		for (String alphabet: croatiaAlphabet) {
			
			changedWord = changedWord.replace(alphabet, "?");
		}
		System.out.println(changedWord.length());

	}
}
