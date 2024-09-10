def solution(dots):
    if isParellel(dots[0], dots[1], dots[2], dots[3]) or isParellel(dots[0], dots[2], dots[1], dots[3]) or isParellel(dots[0], dots[3], dots[1], dots[2]):
        return 1
    return 0

def isParellel(dot1, dot2, dot3, dot4):
    dx1 = dot1[0] - dot2[0]
    dy1 = dot1[1] - dot2[1]
    dx2 = dot3[0] - dot4[0]
    dy2 = dot3[1] - dot4[1]
    return dy1*dx2 == dy2*dx1