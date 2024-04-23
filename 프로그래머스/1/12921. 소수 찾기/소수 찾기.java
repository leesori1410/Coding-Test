class Solution {
    public int solution(int n) {
        int answer = 0, count;
        for (int i = 2; i<=n; i++) {
            count=0;
            for (int j=2; j<=Math.sqrt(i); j++) {	
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if(count==0)
                answer++;
	    }
        return answer;
    }
}