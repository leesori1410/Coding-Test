def solution(s, skip, index):
    answer = ''
    for ss in s:
        an = ord(ss)
        i=1
        while i<=index:
            if an==122: an=96
            an += 1
            for sk in skip:
                if(chr(an)==sk):
                    i-=1
                    break
            i+=1
        answer+= chr(an)
    return answer