import math

def solution(n):
    answer = 1
    dis = n
    while not(dis == 1):
        if dis % 2 == 0:
            dis /= 2
        else:
            dis -= 1
            answer += 1
    return answer