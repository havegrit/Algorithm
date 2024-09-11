def solution(lines):
    answer = 0
    
    lines.sort(key=lambda x: [x[1], x[0]])
    
    line1 = lines[0]
    line2 = lines[1]
    line3 = lines[2]
    
    lineStart1 = line1[0]
    lineEnd1 = line1[1]
    
    lineStart2 = line2[0]
    lineEnd2 = line2[1]
    
    lineStart3 = line3[0]
    lineEnd3 = line3[1]
    
    overlappedCnt = 0
    
    for i in range(lineStart1, lineEnd3+1):
        if i > lineStart1 and i <= lineEnd1:
            overlappedCnt += 1
        if i > lineStart2 and i <= lineEnd2:
            overlappedCnt += 1
        if i > lineStart3 and i <= lineEnd3:
            overlappedCnt += 1
        
        if overlappedCnt > 1:
            answer += 1
        overlappedCnt = 0
            
    return answer