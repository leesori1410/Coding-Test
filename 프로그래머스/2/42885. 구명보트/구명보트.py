def solution(people, limit):
    answer = 0
    people.sort(reverse=True)
    idx = len(people) - 1
    i = 0
    while i <= idx:
        if people[i] + people[idx] <= limit:
            answer += 1
            idx -= 1
            i += 1
        else:
            answer += 1
            i += 1
    return answer