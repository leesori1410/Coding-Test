def solution(N, stages):
    answer = [i for i in range(1, N+1)]
    failureRate = []
    for i in answer:
        player = 0
        clear = 0
        for j in stages:
            if i == j:
                player += 1
            if i < j or i == j:
                clear += 1
        if clear != 0:
            failureRate.append(player/clear)
        else:
            failureRate.append(0)
    for i in range(N):
        for j in range(0, N-i-1):
            if failureRate[j] < failureRate[j+1]:
                failureRate[j], failureRate[j+1] = failureRate[j+1], failureRate[j]
                answer[j], answer[j+1] = answer[j+1], answer[j]
    return answer