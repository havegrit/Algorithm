def checkContainsThree(n):
    while n > 0:
        if n % 10 == 3:
            return True
        n //= 10
    return False

def isMultiplesOfThree(n):
    if n % 3 == 0:
        return True
    return False

def solution(n):
    i = 0
    while(n > 0):
        i += 1
        print(f"n: {n}")
        print(f"i: {i}")
        if isMultiplesOfThree(i) or checkContainsThree(i):
            n += 1
        n -= 1

    return i