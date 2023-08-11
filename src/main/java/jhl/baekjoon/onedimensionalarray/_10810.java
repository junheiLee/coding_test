package jhl.baekjoon.onedimensionalarray;

import java.util.Scanner;

import jhl.Solution;

public class _10810 implements Solution {
	
	@Override
	public void execute() {
		this.solution();
	}
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] basket = new int[N];
		for(int i = 0; i < N; i ++) {
			basket[i] = 0;
		}
		
		int M = sc.nextInt();
		int begin = 0;
		int end = 0;
		int number = 0;
		for(int i = 0; i < M; i++ ) {
			begin = sc.nextInt();
			end = sc.nextInt();
			number = sc.nextInt();
			
			for (int j = (begin-1) ; j<end; j++) {
				basket[j] = number;
			}
		}
		
		for(int num: basket) {
			System.out.print(num + " ");
		}
	}

}