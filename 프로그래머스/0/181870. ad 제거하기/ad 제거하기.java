class Solution {
    public String[] solution(String[] strArr) {
        int index=0;
        for(int i=0; i<strArr.length; i++)
            if(!strArr[i].contains("ad"))
                index++;
        String[] answer = new String[index];
        for(int i=0, j=0; i<strArr.length; i++)
            if(!strArr[i].contains("ad"))
                answer[j++]=strArr[i];
        
        return answer;
    }
}