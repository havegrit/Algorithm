def solution(numbers, k):
    cnt = 0
    i = 0
    while True:
        cnt += 1        
        if i >= len(numbers):
            i = i - len(numbers)
        if cnt == k:
            answer = numbers[i]
            return answer
        i += 2
