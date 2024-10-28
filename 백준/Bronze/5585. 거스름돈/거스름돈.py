change = 1000 - int(input())

answer = 0

while change > 0:
    if change >= 500:
        change -= 500
        answer += 1
    elif change >= 100:
        change -= 100
        answer += 1
    elif change >= 50:
        change -= 50
        answer += 1
    elif change >= 10:
        change -= 10
        answer += 1
    elif change >= 5:
        change -= 5
        answer += 1
    elif change >= 1:
        change -= 1
        answer += 1

print(answer)