class Solution {
    public int solution(String my_string, String is_suffix) {
        boolean tf=my_string.endsWith(is_suffix);
        int answer = tf==true ? 1 : 0;
        return answer;
    }
}