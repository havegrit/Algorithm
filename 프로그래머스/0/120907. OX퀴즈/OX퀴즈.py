def solution(quiz):
    answer = []
    for expression in quiz:
        if isCorrectCalculate(expression.split(' ')) == True:
            answer.append('O')
        else:
            answer.append('X')
    return answer

def isCorrectCalculate(expression):
    if expression[1] == '+':
        result = int(expression[0]) + int(expression[2])
    else:
        result = int(expression[0]) - int(expression[2])
    
    if result == int(expression[4]):
        return True
    
    return False