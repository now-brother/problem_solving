from collections import deque

def bfs(graph, ans):
    queue = deque([1])

    while queue:
        node = queue.popleft()
        for i in graph[node]:
            if ans[i] == 0:
                ans[i] = node
                queue.append(i)
    return ans[2:]

if __name__ == "__main__":
    N = int(input())
    graph = [[]for _ in range(N + 1)]
    ans = [0] * (N + 1)

    for _ in range(N-1):
        a,b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    
    for i in bfs(graph, ans):
        print(i)