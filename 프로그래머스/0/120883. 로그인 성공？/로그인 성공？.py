def solution(id_pw, db):
    for data in db:
        answer = 'fail'
        if id_pw[0] == data[0]:
            answer = "wrong pw"
            if id_pw[1] == data[1]:
                answer = "login"
            return answer
                
    return answer