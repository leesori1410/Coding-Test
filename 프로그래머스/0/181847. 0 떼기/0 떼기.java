class Solution {
    public String solution(String n_str) {
        String answer = "";
        int z=0;
        for(int i=0; i<n_str.length(); i++){
            if(z==0){
                if(n_str.charAt(i)!='0'){
                    answer += n_str.charAt(i);
                    z=1;
                }
            }
            else{
                answer += n_str.charAt(i);
            }
        }
        return answer;
    }
}