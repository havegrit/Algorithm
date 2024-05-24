def solution(n):
    answer = set()
    i = 2
    while True:
        if n == 1:
            break
        if n % i == 0:
            n /= i
            answer.add(i)
        else:
            i += 1
    answer = list(answer)
    answer.sort()
    return answer