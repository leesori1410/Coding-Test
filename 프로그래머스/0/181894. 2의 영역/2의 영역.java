class Solution {
    public int[] solution(int[] arr) {
        int start=-1, finish=-1;
        for(int i=0; i<arr.length; i++)
            if(arr[i]==2){
                start=i;
                break;
            }
        for(int i=arr.length-1; i>=0; i--)
            if(arr[i]==2){
                finish=i;
                break;
            }
        if(start==-1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[finish-start+1];
        if(start==finish){
            answer[0] = arr[start];
        }
        else{
            for(int i=0; start<=finish; start++, i++)
                answer[i]=arr[start];
        }
        return answer;
    }
}