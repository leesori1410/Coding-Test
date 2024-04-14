class Solution {
    public int[] solution(int[] arr) {
        int index=0;
        for(int i=0; i<arr.length; i++){
            index+= arr[i];
        }
        int[] answer = new int[index];
        for(int i=0, k=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++, k++){
                answer[k] = arr[i];  
            }
        }
        return answer;
    }
}