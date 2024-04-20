class Solution {
    public int[] solution(int[] numbers, String direction) {
        int temp;
        if(direction.equals("right")){
            for(int i=0; i<numbers.length-1; i++){
                temp=numbers[0];
                numbers[0]=numbers[i+1];
                numbers[i+1]=temp;
            }
        }
        else{
            for(int i=1; i<numbers.length; i++){
                temp=numbers[i-1];
                numbers[i-1]=numbers[i];
                numbers[i]=temp;
            }
        }
        int[] answer =numbers;
        return answer;
    }
}