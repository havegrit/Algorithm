memberCnt = int(input())
INF = float('inf')
friendship = [[INF] * (memberCnt + 1) for _ in range(memberCnt + 1)]

for i in range(1, memberCnt + 1):
    friendship[i][i] = 0

while True:
    first, second = map(int, input().split())
    if first == -1 and second == -1:
        break
    friendship[first][second] = 1
    friendship[second][first] = 1

for i in range(1, memberCnt + 1):
    for j in range(1, memberCnt + 1):
        for k in range(1, memberCnt + 1):
            friendship[j][k] = min(friendship[j][k], friendship[j][i] + friendship[i][k])

scores = []
for i in range(1, memberCnt + 1):
    maxDist = 0
    for j in range(1, memberCnt + 1):
        if i != j:
            maxDist = max(maxDist, friendship[i][j])
    scores.append(maxDist)

candidate = []
candidateScore = min(scores)

for i in range(memberCnt):
    if scores[i] == candidateScore:
        candidate.append(i + 1)

print(candidateScore, len(candidate))
print(" ".join(map(str, candidate)))