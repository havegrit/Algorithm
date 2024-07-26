def solution(dots):
    answer = 0
    maxX = -256
    maxY = -256 
    minX = 256
    minY = 256
    
    for dot in dots:
        if dot[0] > maxX:
            maxX = dot[0]
        elif dot[0] < minX:
            minX = dot[0]
        if dot[1] > maxY:
            maxY = dot[1]
        elif dot[1] < minY:
            minY = dot[1]
    
    answer = (maxX - minX) * (maxY - minY)
    
    return answer