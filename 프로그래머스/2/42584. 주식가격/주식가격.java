class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int len = prices.length;
        int j;
        for(int i=0; i<len-1; i++){
            for(j=i; j<len; j++){
                if(prices[i]<=prices[j]){
                    answer[i]++;
                }
                else{
                    break;
                }
            }
            if(j == len) answer[i]--;
        }
        
        return answer;
    }
}