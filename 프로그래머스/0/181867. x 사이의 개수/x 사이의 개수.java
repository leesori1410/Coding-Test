class Solution {
    public int[] solution(String myString) {
        int count=0;
        for(int i=0;i<myString.length(); i++){
            if(myString.charAt(i) == 'x')
                count++;
        }
        int[] answer = new int[count+1];
        count=0;
        for(int i=0, j=0;i<myString.length(); i++){
            if(myString.charAt(i) != 'x')
                count++;
            else{
                j++;
                count = 0;
            }
            answer[j] = count;
        }
        return answer;
    }
}