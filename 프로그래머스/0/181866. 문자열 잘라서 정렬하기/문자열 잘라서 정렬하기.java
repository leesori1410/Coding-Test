import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x+");
        Arrays.sort(answer);
        int count=0;
        for(int i=0, j=0; i<answer.length; i++){
            if(!answer[i].equals(""))
                count++;
        }
        String[] an = new String[count];
        for(int i=0, j=0; i<answer.length; i++){
            if(!answer[i].equals(""))
                an[j++]=answer[i];
        }
        return an;
    }
}