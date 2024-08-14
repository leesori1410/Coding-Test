class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    for(int n=2; n<sum; n++){
                        if(sum%n==0)
                            break;
                        if(n==sum-1)
                            answer++;
                    }
                }
            }
        }

        return answer;
    }
}