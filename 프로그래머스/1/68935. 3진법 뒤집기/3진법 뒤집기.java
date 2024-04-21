class Solution {
    public int solution(int n) {
        int answer = 0;
        String n3 = Integer.toString(n,3);
        char[] n3Char = new char[n3.length()];
        char temp;
        for(int i=0; i<n3.length(); i++)
            n3Char[i]=n3.charAt(i);
        for(int i=0, j=n3Char.length-1; i<j; i++, j--){
            temp=n3Char[i];
            n3Char[i]=n3Char[j];
            n3Char[j]=temp;
        }
        n3="";
        for(int i=0; i<n3Char.length; i++)
            n3+=n3Char[i];
        answer = Integer.parseInt(n3,3);
            
        
        return answer;
    }
}