def solution(n, words):
    answer = [0, 0]
    sh = [words[0]]
    for i in range(1, len(words)):
        if words[i] in sh or len(words[i]) == 1 or words[i-1][-1] != words[i][0]:
            answer[0] = i%n + 1
            answer[1] = int(i/n) + 1
            break
        sh.append(words[i])
    return answer