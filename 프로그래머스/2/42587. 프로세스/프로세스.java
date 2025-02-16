import java.util.*;

class Solution {
    public boolean compareQ(Queue<Float> Q, int value) {
        for (Float num : Q) {
            if ((int) ((num * 10) % 10) > value) { 
                return true; 
            }
        }
        return false; 
    }
    
    public int solution(int[] priorities, int location) {
        int pri = 0; 
        Queue<Float> priQ = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            priQ.offer(i + (priorities[i] / 10.0f));
        }
        while (!priQ.isEmpty()) {
            float priorityF = priQ.poll(); 
            int priority = (int) ((priorityF * 10) % 10); 
            int index = (int) Math.floor(priorityF);  
            if (compareQ(priQ, priority)) {
                priQ.offer(priorityF); 
            } else {
                pri++; 
                if (index == location) {
                    return pri; 
                }
            }
        }
        return pri;
    }
}