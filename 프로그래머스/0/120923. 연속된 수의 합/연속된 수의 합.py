def solution(num, total):
    answer = []
    start = 50
    end = 50 + num
    
    while True:
        answer.clear()
        summ = 0
            
        for i in range(start, end):
            answer.append(i)
            summ += i
        
        if summ == total:
            break
            
        if total < summ:
            start -= 1
            end -= 1
        else:
            start += 1
            end += 1
        
    return answer