class Solution {
    public int solution(String my_string, String is_prefix) {
        boolean tf=my_string.startsWith(is_prefix);
        int answer = tf==true ? 1 : 0;
        return answer;
    }
}