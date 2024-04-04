class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int count=0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==(str2.charAt(count)))
                count++;
            else 
                count=0;
            if(count==str2.length()){
                answer = 1;
                break;
           }
        }
        
        return answer;
    }
}