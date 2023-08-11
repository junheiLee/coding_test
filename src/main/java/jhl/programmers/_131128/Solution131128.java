package jhl.programmers._131128;

import java.util.Arrays;

import jhl.Solution;

public class Solution131128 implements Solution{
	
	@Override
	public void execute() {
		String X = "1005";
		String Y = "1005";
		System.out.println(this.solution(X, Y));
	}
	
	public String solution(String X, String Y) {
		
		char[] charX = X.toCharArray();
		char[] charY = Y.toCharArray();
		
		Arrays.sort(charX);
		Arrays.sort(charY);
		
		int xi = charX.length - 1;
		int yi = charY.length - 1;
		
		StringBuilder sb = new StringBuilder();
		
		while(xi >= 0 && yi >= 0 ) {
			
			if(charX[xi] == charY[yi] ) {
				sb.append(charX[xi]);
				xi --;
				yi --;
			} else if( charX[xi] > charY[yi]) {
				xi --;
			} else {
				yi --;
			}
		}
		
		if(sb.length() == 0) {
			return "-1";
		} else if(sb.indexOf("0") == 0) {
			return "0";
		} else {
			return sb.toString();
		}	
	}
}
