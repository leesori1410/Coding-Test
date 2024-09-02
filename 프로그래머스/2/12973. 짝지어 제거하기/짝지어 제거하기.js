function solution(s)
{
    let st = [];
    let answer = 0;
    for(let i = 0; i < s.length; i++){
        if(st[st.length-1] != s[i])
            st.push(s[i]);
        else
            st.pop();
    }
    if(st.length === 0)
        answer = 1;
    return answer;
}