class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            int cnt=1;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]<emergency[j])
                    cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
    }
}