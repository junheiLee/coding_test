package jhl.programmers._12928;

import jhl.Solution;

public class Solution12928 implements Solution {

	private int n;
	
	@Override
	public void execute() {
		n = 28;
		System.out.println(this.solution(n));
	}
	
	public int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n/2; i++) {
			if(n%i==0) {
				answer += i;
			}
		}
		return answer + n;
	}
}
