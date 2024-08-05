def solution(spell, dic):
    shouldContinue = False
    charSet = set()
    
    for word in dic:
        answer = 1
        charSet = set()
        for char in word:
            if char in spell:
                charSet.add(char)
            else:
                answer = 2
                shouldContinue = True
                break
        answer = 2 if len(set(spell) - charSet) != 0 else 1
        if answer == 1:
            break
        if shouldContinue:
            shouldContinue = False
            continue
        
    return answer