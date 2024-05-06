class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int count=0;
        for(int i=0; i<flag.length; i++){
            if(flag[i]==true)
                count+=arr[i]*2;
            else
                count-=arr[i];
        }
        int[] answer = new int[count];
        for(int i=0, idx=0; i<flag.length; i++){
            if(flag[i]==true)
                for(int j=0; j<arr[i]*2; j++, idx++){
                    if(idx>=answer.length)
                        continue;
                    else if(idx>=0)
                        answer[idx]=arr[i];
                }
            else
                idx-=arr[i];
        }
        return answer;
    }
}