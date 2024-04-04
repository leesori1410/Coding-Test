class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int sum = sides[0]+sides[1]+sides[2];
        for(int i=0; i<sides.length; i++){
            if(sides[i]>=sum-sides[i]){
                answer = 2;
            }
        }
        return answer;
    }
}