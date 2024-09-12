def solution(numlist, n):
    answer = []
    distance = []
    
    numlist.sort()
    for index, num in enumerate(numlist):
        distance.append(tuple((index, abs(n-num))))
        
    distance.sort(key=lambda x: (x[1], -x[0]))
    
    for index, num in distance:
        answer.append(numlist[index])
        
    return answer