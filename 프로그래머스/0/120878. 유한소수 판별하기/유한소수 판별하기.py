import math 

def solution(a, b):
    gcd = math.gcd(a, b)

    b /= gcd

    while b > 1:
        b = int(b)
        if b % 2 == 0:
            b /= 2
        elif b % 5 == 0:
            b /= 5
        else:
            return 2
    
    return 1