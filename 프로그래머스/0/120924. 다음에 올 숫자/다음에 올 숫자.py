def solution(common):
    answer = 0
    
    sizeOfCommon = len(common)
    
    arithmetic = 0
    geometric = 0
    
    if common[sizeOfCommon - 1] - common[sizeOfCommon - 2] == common[1] - common[0]:
        geometric = 0
        arithmetic = common[sizeOfCommon - 1] - common[sizeOfCommon - 2]
    else:
        arithmetic = 0
        geometric = common[sizeOfCommon - 1] / common[sizeOfCommon - 2]
    
    if geometric:
        return common[sizeOfCommon - 1] * geometric
    else:
        return common[sizeOfCommon - 1] + arithmetic