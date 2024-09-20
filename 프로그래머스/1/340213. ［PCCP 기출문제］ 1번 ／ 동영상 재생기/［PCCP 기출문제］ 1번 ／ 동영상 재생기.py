def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    
    pos = timeToSec(pos)
    op_start = timeToSec(op_start)
    op_end = timeToSec(op_end)
    video_end = timeToSec(video_len)
    
    if pos > op_start and pos < op_end:
        pos = op_end
    
    for command in commands:
        if command == "next":
            pos += 10
        else:
            pos -= 10
            
        if pos >= video_end:
            pos = video_end
        if pos < 0:
            pos = 0
        
        if pos >= op_start and pos < op_end:
            pos = op_end
    
    answer = secToTime(pos)

    return answer

def getMin(time):
    return int(time[0:2])

def getSec(time):
    return int(time[3:5])

def timeToSec(time):
    return getMin(time) * 60 + getSec(time)

def secToTime(sec):
    minutes = sec // 60
    sec = sec % 60
    if minutes < 10:
        minutes = "0" + str(minutes)
    else:
        minutes = str(minutes)
    if sec < 10:
        sec = "0" + str(sec)
    else:
        sec = str(sec)
        
    return minutes + ":" + sec
    