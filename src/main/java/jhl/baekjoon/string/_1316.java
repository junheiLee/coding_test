package jhl.baekjoon.string;

import java.util.Scanner;

public class _1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int result = n;

		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();

			boolean[] visited = new boolean[26]; // 알파벳 개수
			visited[word.charAt(0) - 'a'] = true; // 첫번째 글자 방문

			for (int j = 1; j < word.length(); j++) {

				if (word.charAt(j) == word.charAt(j - 1)) { // 연속된 알파벳
					continue;
				}
				
				if (visited[word.charAt(j) - 'a'] == true) { // 연속되지 않았는데, 방문한 적 있는 알파벳
					result--;
					break;
				}
				
				visited[word.charAt(j) - 'a'] = true; // 연속되지 않고, 방문한 적 없으면 방문으로 변경
				
			}
		}
		
		System.out.println(result);

	}

	private static void checker01() {
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
