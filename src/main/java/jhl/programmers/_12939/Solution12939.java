package jhl.programmers._12939;

import jhl.Solution;

public class Solution12939 implements Solution {

    public String s;

    @Override
    public void execute(){
        s = "1 2 3 4"; //주어지는 수
        System.out.println(this.solution(s));
    }

    public String solution(String s) {

        String[] strs = s.split(" ");

        int max, min, n;
        max = min = Integer.parseInt(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            n = Integer.parseInt(strs[i]);

            if (max < n) {
                max = n;
            }

            if (min > n) {
                min = n;
            }
        }

        String answer = min + " " + max;
        return answer;
    }

}
