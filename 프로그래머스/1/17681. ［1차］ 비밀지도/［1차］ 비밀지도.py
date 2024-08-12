def solution(n, arr1, arr2):
    answer = []
    map1 = []
    map2 = []
    n = int(n)
    for i in arr1:
        val1 = format(i, 'b')
        val1 = "{0:0>{1}}".format(val1, n)
        map1.append(val1)
    for i in arr2:
        val2 = format(i, 'b')
        val2 = "{0:0>{1}}".format(val2, n)
        map2.append(val2)
    for val1, val2 in zip(map1, map2):
        map0 = ""
        for val11, val22 in zip(val1, val2):
            if val11=="0" and val22=="0":
                map0 += " "
            else:
                map0 += "#"
        answer.append(map0)
    
    return answer