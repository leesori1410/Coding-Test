def solution(want, number, discount):
    answer = 0
    for i in range(len(discount)-9):
        dis_list = discount[i:i+10]
        cnt = True
        for j in range(len(want)):
            if not(number[j] == dis_list.count(want[j])):
                cnt = False
                break
        if cnt:
            answer += 1
    
    return answer