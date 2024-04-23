import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String temp="";
        Arrays.sort(strings);
        for(int i=0; i<strings.length; i++){
            for(int j=i+1; j<strings.length; j++){
                if(strings[i].charAt(n)>strings[j].charAt(n)){
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
                else{
                    if(strings[i].compareTo(strings[j])>0){
                        temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        
        String[] answer = strings;
        return answer;
    }
}