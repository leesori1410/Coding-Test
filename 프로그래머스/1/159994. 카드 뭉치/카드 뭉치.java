class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int n=0, m=0;
        int count;
        for(int i=0; i<goal.length; i++){
            count=0;
            if(n<cards1.length)
                if(cards1[n].equals(goal[i])){
                    n++;
                    count++;
                }
            if(m<cards2.length)
                if(cards2[m].equals(goal[i])){
                    m++;
                    count++;
                }
            if(count==0){
                answer="No";
                break;
            }
        }
        return answer;
    }
}