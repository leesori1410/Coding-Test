function solution(s) {
    var answer = '';
    s = s.split(' ');
    var index = 0;
    for(let i of s){
        var str = ''
        for(let j in i){
            if(j!=0)
                str += i[j].toLowerCase();
            else
                str += i[j].toUpperCase();
        }
        s[index++] = str;
    }
    answer = s.join(' ');
        
    return answer;
}