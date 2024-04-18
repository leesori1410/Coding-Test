import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i=my_string.length()-1; i>=0; i--){
            String my = "";
            for(int j=my_string.length()-1; j>=i; j--){
                my=my_string.charAt(j)+my;
            }
            answer[i]=my;
        }
        Arrays.sort(answer);
        return answer;
    }
}