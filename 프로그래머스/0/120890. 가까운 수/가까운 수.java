class Solution {
    public int solution(int[] array, int n) {
        int answer = 101;
        int dis = 101;
        for(int i=0; i<array.length; i++){
            int a = Math.abs(n-array[i]);
            if(dis>a){
                answer = array[i];
                dis = a;
            }
            else if(dis==a)
                if(array[i]<answer)
                    answer = array[i];
        }
        return answer;
    }
}