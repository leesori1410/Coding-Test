import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=0, j=score.length-m; i<score.length/m; i++, j-=m){
            answer += score[j]*m;
        }
        
        return answer;
    }
}