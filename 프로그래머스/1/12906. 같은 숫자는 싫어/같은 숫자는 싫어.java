import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int index=1;
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                count++;
            }
        }
        
        int[] answer = new int[count];
        answer[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                answer[index++] = arr[i];
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        

        return answer;
    }
}