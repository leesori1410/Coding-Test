class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w=0;
        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[i].length; j++){
                if(w<sizes[i][j])
                    w=sizes[i][j];
            }
        }
        int h=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                if(sizes[i][1]>h)
                    h=sizes[i][1];
            }
            else{
                if(sizes[i][0]>h)
                    h=sizes[i][0];
            }
        }
        answer= h*w;
        return answer;
    }
}