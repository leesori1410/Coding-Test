class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int count=0;
        for(int i=0; i<intStrs.length; i++){
            int str = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(str>k)
                count++;
        }
        int[] answer = new int[count];
        for(int i=0, idx=0; i<intStrs.length; i++){
            int str = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(str>k)
                answer[idx++]=str;
        }
        return answer;
    }
}