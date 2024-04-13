class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length!=arr2.length){
            answer = arr1.length>arr2.length ? 1 : -1;
        }
        else{
            int arr1_t=0, arr2_t=0;
            for(int i=0; i<arr1.length; i++){
                arr1_t += arr1[i];
                arr2_t += arr2[i];
            }
            if(arr1_t != arr2_t)
                answer = arr1_t>arr2_t ? 1 : -1;
        }
        return answer;
    }
}