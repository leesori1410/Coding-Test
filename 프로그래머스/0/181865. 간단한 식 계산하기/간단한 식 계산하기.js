function solution(binomial) {
    var answer = 0;
    var bin = binomial.split(" ");
    if(bin[1]==='+')
        answer = Number(bin[0])+Number(bin[2]);
    else if(bin[1]==='-')
        answer = Number(bin[0])-Number(bin[2]);
    else
        answer = Number(bin[0])*Number(bin[2]);
    return answer;
}