class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++)
                if(arr[i]==delete_list[j])
                    count++;
        }
        int[] answer = new int[arr.length-count];
        for(int i=0, index=0; i<arr.length; i++){
            count=0;
            for(int j=0; j<=delete_list.length; j++){
                if(j==delete_list.length){
                    if(count==1)
                        break;
                    else
                        answer[index++]=arr[i];
                }
                else{
                    if(arr[i]==delete_list[j])
                        count++;
                }
            }
        }
        return answer;
    }
}