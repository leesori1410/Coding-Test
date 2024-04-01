class Solution {
    public long solution(long n) {
        long answer = 0;
        int i = 1;
        while(true){
            if(Math.pow(i, 2) == n){
                answer = (long)Math.pow(i+1, 2);
            }   
            if(Math.pow(i, 2) >= n)
                break;
            i++;
        }
        if(answer == 0)
            answer = -1;
        return answer;
    }
}