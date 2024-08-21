function solution(s) {
    var answer = 0;
    s = s.split(' ');
    for(let i in s){
        if(s[i]!='Z')
            answer += Number(s[i]);
        else if(s[i]==='Z')
            answer -= Number(s[i-1]);
    }
    return answer;
}