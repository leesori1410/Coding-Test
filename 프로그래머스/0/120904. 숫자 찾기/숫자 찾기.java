class Solution {
    public int solution(int num, int k) {
        int answer=-1;
        String n= Integer.toString(num);
        char kk= (char)(k+48);
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)==kk){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}