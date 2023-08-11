package jhl.programmers._12931;

import jhl.Solution;

public class Solution12931 implements Solution {

	@Override
	public void execute() {
		int n = 123;
		System.out.println(this.solution(n));
	}
	
	public int solution(int n) {
		
		int answer = 0;
		int sum = 0;
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		answer += sum;
		return answer;
	}
}
