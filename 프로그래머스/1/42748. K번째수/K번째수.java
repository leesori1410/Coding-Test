import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n=0; n<commands.length; n++){
            int i = commands[n][0]-1;
            int j = commands[n][1]-1;
            int k = commands[n][2]-1;
            int index = 0;
            int numbers[] = new int[j-i+1];
            for(int m=i; m<=j; m++){
                numbers[index++] = array[m];
            }
            Arrays.sort(numbers);
            answer[n] = numbers[k];
            
        }
        return answer;
    }
}