class Solution {
    public int solution(int[] num_list) {
        int even=0, add=0;
        for(int i=0; i<num_list.length; i++){
            if((i+1)%2==0)
                even+=num_list[i];
            else
                add+=num_list[i];
        }
        int answer = even>add ? even : add;
        return answer;
    }
}