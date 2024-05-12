class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=myString.length()-1; i>=0; i--){
            int cnt=0;
            for(int j=pat.length()-1, o=i; j>=0; j--, o--){
                if(myString.charAt(o)==pat.charAt(j))
                    cnt++;
                else
                    break;
            }
            if(cnt==pat.length()){
                answer = myString.substring(0, i+1);
                break;
            }
        }
        return answer;
    }
}