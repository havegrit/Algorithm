def solution(chicken):
    answer = 0
    
    if chicken < 10:
        return 0
    
    answer = answer + chicken // 10 + solution(chicken // 10 + chicken % 10)
    
    return answer