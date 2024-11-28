n = int(input())

i = 0
cnt = 1
while True:
    if n <= cnt:
        print(i + 1)
        break
    i += 1
    cnt += i * 6
    