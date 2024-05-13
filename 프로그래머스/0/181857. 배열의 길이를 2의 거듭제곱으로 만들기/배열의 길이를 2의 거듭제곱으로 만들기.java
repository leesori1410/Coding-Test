class Solution {
    public int[] solution(int[] arr) {
        int idx=1;
        while(arr.length>idx)
            idx*=2;
        int[] answer = new int[idx];
        for(int i=0; i<answer.length; i++){
            if(i<arr.length)
                answer[i]=arr[i];
            else
                answer[i]=0;
        }
        return answer;
    }
}