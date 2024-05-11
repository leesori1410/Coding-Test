class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9'){
                String str = "0";
                while(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9'){
                    str+=my_string.charAt(i++);
                    if(i==my_string.length())
                        break;
                }
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}