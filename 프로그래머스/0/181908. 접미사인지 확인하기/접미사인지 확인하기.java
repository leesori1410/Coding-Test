class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String str="";
        for(int i=my_string.length()-1; i>=0; i--){
            str = my_string.charAt(i)+str;
            if(str.equals(is_suffix))
                return 1;
        }
        return answer;
    }
}