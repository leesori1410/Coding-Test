import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerL = new ArrayList<>();
        
        int len = progresses.length;
        int done = 0;
        
        while(progresses[len-1] != -1){
            for(int i=0; i<len; i++){
                progresses[i] += speeds[i];
            }
            boolean doneDay = false;
            int cnt = 0;
            for(; done<len; done++){
                if(progresses[done] >= 100){
                    cnt++;
                    doneDay = true;
                    if(len-1 == done){
                        progresses[len-1] = -1;
                    }
                }
                else {
                    break;
                }
            }
            if(doneDay){
                answerL.add(cnt);
            }
        }
        
        int[] answer = new int[answerL.size()];
        for(int i=0; i<answerL.size(); i++){
            answer[i] = answerL.get(i);
        }
        return answer;
    }
}