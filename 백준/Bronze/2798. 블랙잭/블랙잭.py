n, m = map(int, input().split(' '))
cards = list(map(int, input().split(' ')))
sumOfCards = 0
maxx = 0

for i in range(n - 2):
    for j in range(i + 1, n - 1):
        for k in range(j + 1, n):
            sumOfCards = cards[i] + cards[j] + cards[k]
            if sumOfCards <= m and sumOfCards > maxx:
                maxx = sumOfCards

print(maxx)
