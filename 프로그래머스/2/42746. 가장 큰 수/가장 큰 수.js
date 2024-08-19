function solution(numbers) {
    var answer = '';
    numbers.sort((a, b) => {
        let ab = String(a) + String(b);
        let ba = String(b) + String(a);
        return ba.localeCompare(ab);
    });
    if(numbers[0]==0)
        answer = '0';
    else {
        for(let i of numbers)
        answer += String(i);
    }
    
    return answer;
}



