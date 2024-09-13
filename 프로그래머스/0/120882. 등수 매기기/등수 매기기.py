def solution(score):
    averages = list(map(lambda x: (x[0]+x[1])/2, score))

    indexed = [(index, value) for index, value in enumerate(averages)]
    indexed.sort(key=lambda x: (-x[1], x[0]))

    answer = [0 for i in indexed]

    prev = -1
    cnt = 0
    for index, value in indexed:
        cnt += 1
        
        if prev != value:
            rank = cnt
        prev = value

        answer[index] = rank

    return answer