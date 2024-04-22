import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for(int i=0; i<k; i++){
            
        }
        
        for(int i=0; i<score.length; i++){
            int[] s = new int[i+1];
            for(int o=0; o<s.length; o++)
                s[o]=score[o];
            if(i<k){
                int min=score[0];
                for(int j=0; j<=i; j++){
                    if(min>score[j])
                        min=score[j];
                }
                answer[i]=min;
            }
            else{
                Arrays.sort(s);
                answer[i]=s[s.length-k];
            }
        }
        
        return answer;
    }
}