from collections import Counter

def solution(clothes):
    answer = 0
    clothes_count = Counter([category for _, category in clothes])
    answer = 1
    for count in clothes_count.values():
        answer *= (count + 1)
    return answer - 1
    return answer