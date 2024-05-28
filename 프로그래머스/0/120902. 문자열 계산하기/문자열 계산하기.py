def solution(my_string):
    return calculate(my_string.split(' '))

def calculate(stringList):
    if len(stringList) <= 3:
        if stringList[1] == '+':
            return int(stringList[0]) + int(stringList[2])
        else:
            return int(stringList[0]) - int(stringList[2])
    else:
        if stringList[1] == '+':
            stringList.insert(3, int(stringList[0]) + int(stringList[2]))
            stringList.pop(0)
            stringList.pop(0)
            stringList.pop(0)
            return calculate(stringList)
        else:
            stringList.insert(3, int(stringList[0]) - int(stringList[2]))
            stringList.pop(0)
            stringList.pop(0)
            stringList.pop(0)
            return calculate(stringList)
    