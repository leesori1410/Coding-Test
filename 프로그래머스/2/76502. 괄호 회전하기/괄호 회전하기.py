import math

def solution(s):
    answer = 0
    slen = len(s)
    sdic = {")": "(", "]": "[", "}": "{"}
    for i in range(slen):
        sli = []
        for j in range(i, i+slen):
            sli.append(s[j%slen])
        ssli = []
        cnt=0
        for j in range(slen):
            ss = sli[j]
            if ss in "({[":
                ssli.append(ss)
            else:
                if ssli:
                    sss = ssli.pop()
                    if sss == sdic[ss]:
                        cnt += 1
        if cnt*2 == slen:
            answer += 1
    return answer