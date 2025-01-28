import sys
from queue import PriorityQueue

input = sys.stdin.readline

V, E = map(int, input().split())
K = int(input())

lines = [[] for _ in range(V + 1)]
visited = [False] * (V + 1)
distance = [sys.maxsize] * (V + 1)
queue = PriorityQueue()

for _ in range(E):
    u, v, w = map(int, input().split())
    lines[u].append((v, w))

queue.put((0, K))
distance[K] = 0

while queue.qsize() > 0:
    data = queue.get()
    curr = data[1]
    if visited[curr]:
        continue

    visited[curr] = True

    for tmp in lines[curr]:
        next = tmp[0]
        value = tmp[1]
        if distance[next] > distance[curr] + value:
            distance[next] = distance[curr] + value
            queue.put((distance[next], next))

for i in range(1, V + 1):
    if visited[i]:
        print(distance[i])
    else:
        print("INF")