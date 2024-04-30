class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        for(int i=0; i<before.length(); i++){
            int count = 0;
            for(int j=0; j<after.length(); j++){
                if(be[i]==af[j]){
                    count++;
                    af[j]=' ';
                    break;
                } 
            }
            if(count==0){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}