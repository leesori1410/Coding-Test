class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount=0, ycount=0;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                pcount++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                ycount++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        if(ycount != pcount)
            answer = false;
        return answer;
    }
}