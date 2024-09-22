def solution(elements):
    answer = set()
    length = len(elements)
    # for i in range(lenght):
    #     ii = i
    #     for j in range(1, lenght+1):
    #         ss = 0
    #         for k in range(i, ii+j):
    #             ss += elements[k%lenght]
    #         answer.add(ss)
    for i in range(length):
        current_sum = 0
        for j in range(1, length + 1):
            current_sum += elements[(i + j - 1) % length] 
            answer.add(current_sum)  
    return len(answer)