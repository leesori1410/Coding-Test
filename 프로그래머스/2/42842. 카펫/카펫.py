import math

def solution(brown, yellow):
    answer = []
    for i in range (1, math.ceil(math.sqrt(yellow))+1):
        if yellow % i == 0:
            if (2 * i) + (2 * (yellow / i)) + 4 == brown:
                answer.append(yellow / i + 2)
                answer.append(i + 2)
                break
    return answer