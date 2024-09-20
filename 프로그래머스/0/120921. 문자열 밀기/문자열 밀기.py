def solution(A, B):
    answer = 0    
    for i in range(len(A)):
        tmp = ""
        if A == B:
            break
        answer += 1
        for j in range(len(B)):
            if j == len(A) - 1:
                tmp = A[j] + tmp
            else:
                tmp += A[j]
        A = tmp
    
    if answer == len(A):
        answer = -1
        
    return answer