class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char ss;
        for(int i=0; i<s.length(); i++){
            ss=s.charAt(i);
            if(ss==' '){
                answer += ss;
                continue;
            }
            for(int j=0, plus=1; j<n; j++){
                if(ss=='Z')
                    ss='A'-1;
                else if(ss=='z')
                    ss='a'-1;
                ss=(char)(ss+1);
            }
            answer += ss;
        }
        return answer;
    }
}