class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String str = myString.substring(0, myString.lastIndexOf(pat));
        answer = str+pat;
        return answer;
    }
}