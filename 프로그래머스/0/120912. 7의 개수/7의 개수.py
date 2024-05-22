def solution(array):
    answer = 0
    integerArray = map(str, array)
    for i in integerArray:
        answer += i.count('7')
    return answer