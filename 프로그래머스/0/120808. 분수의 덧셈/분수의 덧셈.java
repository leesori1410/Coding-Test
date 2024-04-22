class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int s=1;
        int num1 = numer1*denom2 + numer2*denom1;
        int num2 = denom1*denom2;
        for(int i=num1; i>1; i--){
            if(num1%i==0&&num2%i==0){
                s=i;
                break;
            }
        }
        answer[0]=num1/s;
        answer[1]=num2/s;
        return answer;
    }
}