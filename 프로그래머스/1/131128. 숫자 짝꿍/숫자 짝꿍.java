import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x = new int[10];
        int[] y = new int[10];
        for(int i=0, j=0; i<X.length()||j<Y.length(); i++, j++){
            if(i<X.length())
                x[X.charAt(i)-'0']++;
            if(j<Y.length())
                y[Y.charAt(j)-'0']++;
        }
        for(int i=9; i>=0; i--){
            int min = (x[i]>y[i])?y[i]:x[i];
            answer+=Integer.toString(i).repeat(min);
        }
        if(answer.equals(""))
            answer="-1";
        else if(answer.charAt(0)=='0')
            answer="0";
        return answer;
    }
}