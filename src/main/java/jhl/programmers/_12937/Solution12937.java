package jhl.programmers._12937;

import jhl.Solution;

public class Solution12937 implements Solution {
	
	private int num;
	
	@Override
	public void execute() {
		num = 0;
		System.out.println(this.solution(num));
	}
	
	private static final String EVEN = "Even";
	private static final String ODD = "Odd";
	
	public String solution(int num) {
		String answer = "";
		
		if(num%2!=0) {
			answer = ODD;
		} else {
			answer = EVEN;
		}
		
		return answer;
	}

}
