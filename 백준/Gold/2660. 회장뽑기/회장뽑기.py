import sys

m = int(sys.stdin.readline())
INF = float('inf')
friendship = [[INF for _ in range(m + 1)] for _ in range(m + 1)]

for i in range(1, m + 1):
    friendship[i][i] = 0

while True:
    a, b = map(int, sys.stdin.readline().split())
    if a == -1 and b == -1:
        break
    friendship[a][b] = 1
    friendship[b][a] = 1

for i in range(1, m + 1):
    for j in range(1, m + 1):
        for k in range(1, m + 1):
            friendship[j][k] = min(friendship[j][k], friendship[j][i] + friendship[i][k])

scores = []
for i in range(1, m + 1):
    maxDist = 0
    for j in range(1, m + 1):
        maxDist = max(maxDist, friendship[i][j])
    scores.append(maxDist)

candidateScore = min(scores)
candidate = [i + 1 for i, score in enumerate(scores) if score == candidateScore]

print(candidateScore, len(candidate))
print(*candidate)