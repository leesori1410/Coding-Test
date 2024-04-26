import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] string = my_string.toCharArray();
        Arrays.sort(string);
        for(int i=0; i<string.length; i++){
            answer+=string[i];
        }
        return answer;
    }
}