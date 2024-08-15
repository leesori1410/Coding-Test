class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int place = 0;
        int zero = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0)
                zero++;
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j])
                    place++;
                // System.out.println(place);
            }
        }
        answer[0] = (place==1||place==0?6:7-place);
        place += (zero>=(6-place)) ? 6-place : zero;
        answer[1] = (place==1||place==0?6:7-place);
        if(answer[0]>answer[1]){
            int temp = answer[0];
            answer[0] = answer[1];
            answer[1] = temp;
        }
        return answer;
    }
}