def solution(polynomial):
    answer = '0'
    sumXCofficients = 0
    sumConstants = 0
    for element in polynomial.split(' '):
        if element == '+':
            continue
            
        if element.endswith('x'):
            xCofficient = element[:element.index('x')]

            if xCofficient == '':
                sumXCofficients += 1
            else:
                sumXCofficients += int(xCofficient)
        else:
            sumConstants += int(element)
            
    if sumXCofficients != 0 and sumConstants != 0:
        if sumXCofficients == 1:
            return 'x + ' + str(sumConstants)
        return str(sumXCofficients) + 'x + ' + str(sumConstants)  
    elif sumXCofficients == 0 and sumConstants != 0:
        return str(sumConstants)
    elif sumXCofficients != 0 and sumConstants == 0:
        if sumXCofficients == 1:
            return 'x'
        return str(sumXCofficients) + 'x'
        
    return answer