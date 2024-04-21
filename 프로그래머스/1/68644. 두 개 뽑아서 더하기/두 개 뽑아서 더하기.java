import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int count=0;
        for(int i=1; i<numbers.length; i++){
            count+= i;
        }
        int[] num = new int[count];
        for(int i=0, index=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                num[index++]=numbers[i]+numbers[j];
            }
        }
        Arrays.sort(num);
        count=1;
        for(int i=1; i<num.length; i++){
            if(num[i]!=num[i-1])
                count++;
        }
        int[] answer = new int[count];
        answer[0]=num[0];
        for(int i=1, index=1; i<num.length; i++){
            if(num[i]!=num[i-1])
                answer[index++]=num[i];
        }
        return answer;
    }
}