class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<=myString.length()-pat.length(); i++){
            String string = "";
            for(int j=i; j<i+pat.length(); j++){
                string+=myString.charAt(j);
            }
            if(string.equals(pat))
                answer++;
        }
        return answer;
    }
}