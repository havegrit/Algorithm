def solution(M, N):
    answer = 0
    
    if M == 1 and N == 1:
        return 0
    elif M != 1:
        answer += solution(M // 2, N) + solution(M - M // 2, N) + 1
    elif N != 1:
        answer += solution(M, N // 2) + solution(M, N - N // 2) + 1
    
    return answer