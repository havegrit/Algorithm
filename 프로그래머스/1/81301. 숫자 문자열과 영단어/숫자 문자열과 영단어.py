def solution(s):
    answer = ''
    mappingData = {
        'zero':'0', 'one':'1', 'two':'2', 'three':'3', 'four':'4',
        'five':'5', 'six':'6', 'seven':'7', 'eight':'8', 'nine':'9'
    }
    
    temp = ''
    
    for char in s:
        temp += char
        if len(temp) >= 3 and temp in mappingData.keys():
            answer += mappingData[temp]
            temp = ''
        if char.isnumeric():
            answer += char
            temp = ''
    
    return int(answer)