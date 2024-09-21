def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    
    pos = convertTime(pos)
    op_start = convertTime(op_start)
    op_end = convertTime(op_end)
    video_end = convertTime(video_len)
    
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
    
    answer = convertTime(pos)

    return answer

def convertTime(time):
    if isinstance(time, str):
        time = time.split(":")
        return int(time[0]) * 60 + int(time[1])
    else:
        minutes = time // 60
        time = time % 60
        if minutes < 10:
            minutes = "0" + str(minutes)
        else:
            minutes = str(minutes)
        if time < 10:
            time = "0" + str(time)
        else:
            time = str(time)
            
        return minutes + ":" + time