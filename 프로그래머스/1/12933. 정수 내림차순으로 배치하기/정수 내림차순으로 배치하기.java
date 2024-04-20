import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String N=n+"";
        int narr[]= new int[N.length()];
        for(int i=0; i<N.length(); i++){
            narr[i]=N.charAt(i)-'0';
        }
        Arrays.sort(narr);
        long t=1;
        for(int i=0; i<narr.length; i++, t*=10){
            answer+= narr[i]*t;
        }
        return answer;
    }
}