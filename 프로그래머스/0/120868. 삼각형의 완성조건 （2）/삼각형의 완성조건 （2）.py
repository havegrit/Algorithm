def solution(sides):
    maxSide = sides[0] if sides[0] > sides[1] else sides[1]
    minSide = sides[1] if sides[0] > sides[1] else sides[0]
    answer = (minSide + maxSide) - (maxSide - minSide) - 1
        
    return answer