def solution(babbling):
    answer = 0
    
    pronouns = ["aya", "ye", "woo", "ma"]
    
    for word in babbling:
        for pronoun in pronouns:
            if pronoun in word:
                word = word.replace(pronoun, " ")
        if word.isspace():
            answer += 1
    return answer