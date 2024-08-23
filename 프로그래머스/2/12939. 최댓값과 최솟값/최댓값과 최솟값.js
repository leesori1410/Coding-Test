function solution(s) {
    var answer = '';
    s = s.split(' ');
    s.sort(function(a, b){
        return a-b;
    });
    answer = s[0] + ' ' + s[s.length-1];
    return answer;
}