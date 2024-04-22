class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<=t.length()-p.length(); i++){
            String tt="";
            for(int j=0, plus=i; j<p.length(); j++, plus++){
                tt+=t.charAt(plus);
            }
            if(Long.parseLong(tt)<=Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}