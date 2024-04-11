class Solution {
    public int[] solution(int[] answers) {
        int one[] = {1, 2, 3, 4, 5};
        int two[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int three[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count[] = new int[3];
        for(int i=0, o=0, t=0, h=0; i<answers.length; i++, o++, t++, h++){
            if(o==one.length)
                o=0;
            if(t==two.length)
                t=0;
            if(h==three.length)
                h=0;
            if(answers[i]==one[o]){
                count[0]++;
            }
            if(answers[i]==two[t]){
                count[1]++;
            }
            if(answers[i]==three[h]){
                count[2]++;
            }
        }
        int index=0, max=0;
        for(int i=0; i<count.length; i++){
            if(max<count[i])
                max=count[i];
        }
        for(int i=0; i<count.length; i++){
            if(max==count[i])
                index++;
        }
        int[] answer = new int[index];
        for(int i=0, j=0; i<count.length; i++){
            if(max==count[i]){
                answer[j++]=i+1;
            }
        }
        return answer;
    }
}