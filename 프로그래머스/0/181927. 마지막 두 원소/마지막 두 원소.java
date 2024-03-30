class Solution {
    public int[] solution(int[] num_list) {
        // 이 문제에서는 num_list의 마지막 원소와 그전 원소의 값이 같을 때 상황을 생각하지 않고 있다. 
        // 그래서 else가 아닌 else if를 쓰면 "실패"가 뜬다.
        int[] answer = new int[num_list.length+1];
        for(int i=0; i<num_list.length; i++){
            answer[i] += num_list[i];
        }
        if(num_list[num_list.length-1]>num_list[num_list.length-2])
            answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        else
            answer[answer.length-1] = (num_list[num_list.length-1])*2;
        
        return answer;
    }
}