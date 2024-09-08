def solution(numbers, k):
    answer = 0
    for i in range(k-1):
        answer += 2
    answer = numbers[answer % len(numbers)]
    return answer