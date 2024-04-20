class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min=arr[0], count=0;
        for(int i : arr){
            min = Math.min(min, i);
            count++;
        }
        System.out.println(min);
        if(count==1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[count-1];
            for(int i=0, idx=0; i<arr.length; i++){
                if(arr[i]!=min)
                    answer[idx++]=arr[i];
            }
        }
        
        return answer;
    }
}