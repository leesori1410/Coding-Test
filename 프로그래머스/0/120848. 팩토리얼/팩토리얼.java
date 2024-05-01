class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(i<=n){
            answer++;
            i*=answer;
        }
        return answer-1;
    }
}