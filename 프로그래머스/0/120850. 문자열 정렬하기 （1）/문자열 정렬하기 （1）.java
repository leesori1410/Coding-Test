import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int count=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9')
                count++;
        }
        int[] answer = new int[count];
        for(int i=0, j=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9')
                answer[j++]=(int)my_string.charAt(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}