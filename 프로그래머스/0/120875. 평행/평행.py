def solution(dots):
    if isParellel(dots[0], dots[1], dots[2], dots[3]) or isParellel(dots[0], dots[2], dots[1], dots[3]) or isParellel(dots[0], dots[3], dots[1], dots[2]):
        return 1
    return 0

def isParellel(dot1, dot2, dot3, dot4):
    w = abs(dot1[0] - dot2[0])
    h = abs(dot1[1] - dot2[1])
    if (abs(dot3[0] - dot4[0]) == w and abs(dot3[1] - dot4[1]) == h):
        return 1
    if abs(dot3[0] - dot4[0]) % w == 0 and abs(dot3[1] - dot4[1]) % h == 0 and abs(dot3[0] - dot4[0]) // w == abs(dot3[1] - dot4[1]) // h:
        return 1
    return 0