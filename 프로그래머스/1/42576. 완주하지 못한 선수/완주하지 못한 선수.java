import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> completionMap = new HashMap<String, Integer>();
        for (String com : completion) {
            completionMap.put(com, completionMap.getOrDefault(com, 0) + 1);
        }
        for(String par : participant){
            if(completionMap.containsKey(par)){
                if(completionMap.get(par) == 0) return par;
                completionMap.put(par, completionMap.get(par)-1);
            }
            else {
                return par;
            }
        }
        return "";
    }
}