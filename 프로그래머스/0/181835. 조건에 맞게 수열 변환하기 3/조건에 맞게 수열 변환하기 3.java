class Solution {
    public int[] solution(int[] arr, int k) {
        if(k%2==0){
            for(int i=0; i<arr.length; i++)
                arr[i] +=k;
        }
        else{
            for(int i=0; i<arr.length; i++)
                arr[i] *=k;
        }
        int[] answer = arr;
        return answer;
    }
}