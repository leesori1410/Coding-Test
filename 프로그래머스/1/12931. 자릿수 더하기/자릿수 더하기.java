import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 10; ;){
            answer += n%i;
            n /= i;
            if(n==0) break;
        }

        return answer;
    }
}