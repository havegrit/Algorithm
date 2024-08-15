def solution(n):
    answer = [[0] * n for _ in range(n)]
    
    row = 0
    col = 0
    
    dr = [0, 1, 0, -1]
    dc = [1, 0, -1, 0]
    d = 0
    
    cnt = 1
    
    while(cnt <= n*n):
        answer[row][col] = cnt
        cnt += 1
        if (d == 0 and col + 1 == n) or (d == 0 and answer[row][col+1] != 0):
            d += 1
        elif (d == 1 and row + 1 == n) or (d == 1 and answer[row+1][col] != 0):
            d += 1
        elif (d == 2 and col - 1 < 0) or (d == 2 and answer[row][col-1] != 0):
            d += 1
        elif (d == 3 and row - 1 < 0) or (d == 3 and answer[row-1][col] != 0):
            d += 1
            
        if d > 3:
            d = 0
            
        row += dr[d]
        col += dc[d]
        
    return answer