function solution(s) {
    var answer = [0, 0];
    while(true){
        var len = s.length;
        s = s.replace(/0/g, '');
        len -= s.length;
        answer[1] += len;
        s = s.length.toString(2);
        answer[0]++;
        if(s==='1') break;
    }
    return answer;
}