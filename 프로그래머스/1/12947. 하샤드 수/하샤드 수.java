class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int i=0;
        int X = x;
        while(x>0){
            i += x%10;
            x /= 10;
        }
        if(X%i != 0)
            answer = false;
        return answer;
    }
}