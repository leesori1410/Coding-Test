def solution(arr):
    answer = 0
    key = max(arr)
    while True:
        cnt = 0
        for i in arr:
            if key % i == 0:
                cnt+=1
        if cnt == len(arr):
            answer = key
            break
        key += max(arr)
    return answer