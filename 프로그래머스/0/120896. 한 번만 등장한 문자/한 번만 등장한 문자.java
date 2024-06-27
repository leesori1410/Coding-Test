import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            int one = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j))
                    one++;
            }
            if(one==1)
                answer += s.charAt(i);
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;
    }
}