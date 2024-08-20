class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer = {};
        if(n==1){
            answer = new int[b+1];
            for(int i=0; i<=b; i++){
                answer[i]=num_list[i];
            }
        }
        else if(n==2){
            answer = new int[num_list.length-a];
            for(int i=0; a<num_list.length; a++){
                answer[i++]=num_list[a];
            }
        }
        else if(n==3){
            answer = new int[b-a+1];
            for(int i=0; a<=b; a++){
                answer[i++]=num_list[a];
            }
        }
        else if(n==4){
            if((b-a+1)%c==0)
                answer = new int[(b-a+1)/c];
            else
                answer = new int[(b-a+1)/c+1];
            for(int i=0; a<=b; a+=c){
                answer[i++]=num_list[a];
            }
        }
        return answer;
    }
}