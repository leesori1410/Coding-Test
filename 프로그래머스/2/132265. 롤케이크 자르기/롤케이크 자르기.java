import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> cM = new HashMap<>();
        HashMap<Integer, Integer> dM = new HashMap<>();
        for(int t : topping){
            if(cM.containsKey(t))
                cM.put(t, cM.get(t)+1);
            else
                cM.put(t, 1);
        }
        for(int t : topping){
            int cMget = cM.get(t) - 1;
            if(cMget == 0) 
                cM.remove(t);
            else
                cM.put(t, cMget);
            if(dM.containsKey(t))
                dM.put(t, dM.get(t)+1);
            else
                dM.put(t, 1);
            if(cM.size() == dM.size())
                answer++;
        }
        return answer;
    }
}