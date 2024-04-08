class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(a+""+b);
        answer = (ab>= 2*a*b) ? ab : 2*a*b;
        return answer;
    }
}