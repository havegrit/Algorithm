user_input = input()

n, k = user_input.split(' ')

k = int(k)

a = []

answer = 0

for i in range(int(n)):
    a.append(int(input()))

a.sort(reverse=True)

for coin in a:
    if k == 0:
        break
    coin_count = k // coin
    if coin_count > 0:
        answer += coin_count
        k = k % coin
        
print(answer)