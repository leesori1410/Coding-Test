class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] quer = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++)
            quer[i]=my_string.charAt(i);
        char temp;
        for(int i=0; i<queries.length; i++){
            for(int n=queries[i][0], m=queries[i][1]; n<m; n++, m--){
                temp=quer[n];
                quer[n]=quer[m];
                quer[m]=temp;
            }
        }
        for(int i=0; i<quer.length; i++)
            answer+=quer[i];
        return answer;
    }
}