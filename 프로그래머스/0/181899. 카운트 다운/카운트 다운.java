class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        for(int i=0, num=start; num>=end_num; i++, num--)
            answer[i]=num;
        return answer;
    }
}