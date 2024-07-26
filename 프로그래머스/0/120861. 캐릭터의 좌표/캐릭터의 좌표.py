def solution(keyinput, board):
    answer = [0, 0]
    xMaxMovement = int(board[0] / 2)
    yMaxMovement = int(board[1] / 2)
    maxMovement = [
        yMaxMovement,
        yMaxMovement - yMaxMovement * 2,
        xMaxMovement - xMaxMovement * 2,
        xMaxMovement
    ]

    for key in keyinput:
        if key == "up":
            if answer[1] < maxMovement[0]:
                answer[1] += 1 
        elif key == "down":
            if answer[1] > maxMovement[1]:
                answer[1] -= 1 
        elif key == "left":
            if answer[0] > maxMovement[2]:
                answer[0] -= 1
        else:
            if answer[0] < maxMovement[3]:
                answer[0] += 1
            
    return answer