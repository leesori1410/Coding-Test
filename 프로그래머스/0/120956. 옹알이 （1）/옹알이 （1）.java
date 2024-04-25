class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            int count=0;
            if(babbling[i].contains("aya"))
                babbling[i] = babbling[i].replace("aya", "0");
            if(babbling[i].contains("ye"))
                babbling[i] = babbling[i].replace("ye", "0");
            if(babbling[i].contains("woo"))
                babbling[i] = babbling[i].replace("woo", "0");
            if(babbling[i].contains("ma"))
                babbling[i] = babbling[i].replace("ma", "0");
            for(int j=0; j<babbling[i].length(); j++)
                if(babbling[i].charAt(j)!='0')
                    count++;
            if(count==0)
                answer++;
        }
        return answer;
    }
}