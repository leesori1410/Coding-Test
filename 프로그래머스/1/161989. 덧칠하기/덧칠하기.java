class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint=0;
        for(int i=0; i<section.length; i++){
            if(section[i]>paint){
                paint=(section[i]-1+m);
                answer++;
            }
        }
        return answer;
    }
}