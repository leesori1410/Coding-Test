class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int n;
        for(; i<=j; i++){
            int m=i;
            while(m!=0){
                n = m%10;
                if(n==k)
                    answer++;
                m/=10;
            }
        }
        return answer;
    }
}