class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0, j=0; i<s.length(); i++, j++){
            if(s.charAt(i)==' ')
                j=-1;
            if(j%2==0)
                answer += (Character.toString(s.charAt(i))).toUpperCase();
            else
                answer += (Character.toString(s.charAt(i))).toLowerCase();
        }
        return answer;
    }
}