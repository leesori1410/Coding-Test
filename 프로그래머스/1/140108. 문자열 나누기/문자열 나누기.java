class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder ss = new StringBuilder(s);
        int cnt1 = 0, cnt2 = 0;
        char x = ' ';

        for (int i = 0; i < ss.length(); ) {  
            if (cnt1 == 0) {
                x = ss.charAt(i);
                ss.deleteCharAt(i);
                cnt1++;
                continue;
            }
            if (x == ss.charAt(i)) {  
                ss.deleteCharAt(i);
                cnt1++;
            } else {
                ss.deleteCharAt(i);
                cnt2++;
            }
            if (cnt1 == cnt2) {
                cnt1 = 0;
                cnt2 = 0;
                answer++;
            }
        }
        if(cnt1!=cnt2)
            answer++;

        return answer; 
    }
}
