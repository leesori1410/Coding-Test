import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        for(int i=0, j=-1; i<dartResult.length(); i++){
            if(dartResult.charAt(i)>='1' && dartResult.charAt(i)<='9'){
                score[++j]=(dartResult.charAt(i)-'0');
            }
            else if(dartResult.charAt(i)=='0'){
                if(i>0){
                    if(dartResult.charAt(i-1)=='1')
                        score[j]*=10;
                    else
                        score[++j]=0;
                }
                else
                    score[++j]=0;
            }
            else{
                if(dartResult.charAt(i)=='S')
                    score[j] = (int)Math.pow(score[j], 1);
                else if(dartResult.charAt(i)=='D')
                    score[j] = (int)Math.pow(score[j], 2);
                else if(dartResult.charAt(i)=='T')
                    score[j] = (int)Math.pow(score[j], 3);
                
                else if(dartResult.charAt(i)=='*'){
                    score[j]*=2;
                    if(j>0)
                        score[j-1]*=2;
                }
                else if(dartResult.charAt(i)=='#')
                    score[j]*=(-1);
            }
            System.out.println(score[j]);
        }
        answer = score[0]+score[1]+score[2];
        return answer;
    }
}