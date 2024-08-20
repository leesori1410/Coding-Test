function solution(arr, queries) {
    var answer = [];
    for(let q of queries){
        var an = 1000001;
        for(let i in arr){
            if(q[0]<=i && q[1]>=i && arr[i]>q[2] && an>arr[i]){
                an=arr[i];
            }
        }
        if(an==1000001) answer.push(-1);
        else answer.push(an);
    }
    return answer;
}