class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            int t = 1;
            while(t<=array[i]){
                if(array[i]/t%10 == 7)
                    answer++;
                t *= 10;
            }
        }
        return answer;
    }
}