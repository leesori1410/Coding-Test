import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
//         Map<Character, List<String>> phoneM = new HashMap<>();
//         for(char c='0'; c<='9'; c++){
//             phoneM.put(c, new ArrayList<>());
//         }
        
//         for(String phone : phone_book){
//             phoneM.get(phone.charAt(0)).add(phone);
//         }
//         for(char c='0'; c<='9'; c++){
//             List<String> phoneL = phoneM.get(c);
//             if (phoneL != null) Collections.sort(phoneL);
//         }
        
//         for(char c='0'; c<='9'; c++){
//             List<String> phoneL = phoneM.get(c);
//             if (phoneL == null) continue;
//             for(int j=0; j<phoneL.size()-1; j++) {
//                 if (phoneL.get(j+1).startsWith(phoneL.get(j))) {
//                     return false;
//                 }
//             }
//         }
        
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }
        
        
        return answer;
    }
}