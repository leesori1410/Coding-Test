function solution(bin1, bin2) {
    var answer = '';
    an = parseInt(bin1, 2) + parseInt(bin2, 2);
    answer = an.toString(2);
    return answer;
}