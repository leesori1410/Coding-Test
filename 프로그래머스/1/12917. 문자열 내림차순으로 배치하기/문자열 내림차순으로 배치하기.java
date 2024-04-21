import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss=new String[s.length()];
        char temp;
        for(int i=0; i<s.length(); i++){
            ss[i]=Character.toString(s.charAt(i));
        }
        Arrays.sort(ss, Collections.reverseOrder());
        for(int i=0; i<ss.length; i++){
            answer+=ss[i];
        }
        return answer;
    }
}