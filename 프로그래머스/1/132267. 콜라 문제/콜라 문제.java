class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int i = 0;
        while(n/a>0){
            i = n/a;
            answer += (i*b);
            n  -= i*a;
            n += i*b;
        }
        return answer;
    }
}