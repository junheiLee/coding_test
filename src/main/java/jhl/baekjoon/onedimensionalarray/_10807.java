package jhl.baekjoon.onedimensionalarray;

import java.util.Scanner;

import jhl.Solution;

public class _10807 implements Solution {
	
	@Override
	public void execute() {
		this.solution();
	}
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numbers = new int[N];
		
		for(int i = 0; i < N; i++ ) {
			numbers[i] = sc.nextInt();
		}
		int V = sc.nextInt();
		
		int count = 0;
		
		for(Integer number: numbers) {
			if(number==V) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
