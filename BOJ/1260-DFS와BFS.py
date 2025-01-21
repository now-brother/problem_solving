from collections import deque

def DFS(start):
    visited[start] = True
    print(start, end=" ")

    for i in graph[start]:
        if not visited[i]:
            DFS(i)

def BFS(start):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v, end=" ")
        for i in graph[v]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)

if __name__ == "__main__":
    N, M, V = map(int, input().split())
    graph = [[]for _ in range(N+1)]

    for _ in range (M):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    for i in graph:
        i.sort()

    visited = [False] * (N + 1)
    DFS(V)
    print()

    visited = [False] * (N + 1)
    BFS(V)