import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> answerL = new ArrayList<>();
        Map<String, Integer> alp = new HashMap<>();
        for(int i=0; i<26; i++){
            alp.put(Character.toString((char)('A' + i)), i+1);
        }
        int keyI = 27; 
        int i = 0;
        while(i < msg.length()){
            int j = i+1;
            while(j <= msg.length() && alp.containsKey(msg.substring(i, j))){
                j++;
            }
            answerL.add(alp.get(msg.substring(i, j-1)));
            if(j <= msg.length()){
                alp.put(msg.substring(i, j), keyI++);
            }
            i = j-1;
        }
        return answerL.stream().mapToInt(Integer::intValue).toArray();
    }
}
