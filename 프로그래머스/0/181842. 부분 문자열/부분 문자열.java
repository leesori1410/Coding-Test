class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // for(int i=0; i<str2.length()-str1.length()+1; i++){
        //     for(int j=0; j<str1.length(); j++){
        //         if(str2.charAt(i+j)==str1.charAt(j))
        //             answer=1;
        //         else{
        //             answer = 0;
        //             break;
        //         }
        //     }
        //     if(answer==1)
        //         break;
        // }
        if(str2.contains(str1))
            answer=1;
        return answer;
    }
}