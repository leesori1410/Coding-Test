class Solution {
    public int solution(int[] num_list) {
        int sum=0, square=1;
        for(int i : num_list){
            square *= i;
            sum += i;
        }
        int answer = square < sum*sum ? 1 : 0;
        return answer;
    }
}