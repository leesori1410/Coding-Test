class Solution {
    public String solution(int age) {
        String answer = "";
        char ageint;
        while(age>0){
            ageint = (char)(age%10);
            answer = (char)(ageint+'a')+answer;
            age/=10;
        }
        return answer;
    }
}