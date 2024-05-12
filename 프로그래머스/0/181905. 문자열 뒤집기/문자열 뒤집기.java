class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str1 = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(str1);
        String str2 = sb.reverse().toString();
        answer = my_string.replace(str1, str2);
        return answer;
    }
}