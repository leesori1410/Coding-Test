import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1;
        Stack<Integer> orderS = new Stack<>();
        for(int i=0; i<order.length; i++){
            if(box <= order[i]){
                while(box <= order[i]){
                    if(box == order[i]){
                        answer++;
                        box++;
                        break;
                    }
                    orderS.push(box++);
                }
            }
            else if(!orderS.isEmpty() && orderS.peek() == order[i]){
                answer++;
                orderS.pop();
            }
            else{
                break;
            }
        }
        return answer;
    }
}