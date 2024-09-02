def solution(n):
    answer = 0
    i = 0
    j = 1
    for cnt in range(2, n):
        if cnt % 2 == 0:
            i += j
        else:
            j += i
    answer = (i + j) % 1234567
    return answer