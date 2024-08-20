def solution(myStr):
    answer = []
    string = ''
    for i in myStr:
        if (i=='a' or i=='b' or i=='c'):
            if string != '':
                answer.append(string)
            string = ''
        else:
            string += i
    if(string != ''):
        answer.append(string)
    if(len(answer) == 0):
        answer.append('EMPTY')
    return answer