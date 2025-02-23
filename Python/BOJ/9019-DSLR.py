from collections import deque

def DSLR(start, target):
    queue = deque([(start, "")])
    visited = [False] * 10000
    visited[start] = True

    while queue:
        number, path = queue.popleft()

        if number == target:
            return path

        D = (2 * number) % 10000
        if not visited[D]:
            visited[D] = True
            queue.append((D, path + 'D'))

        S = (number - 1) % 10000 if number != 0 else 9999
        if not visited[S]:
            visited[S] = True
            queue.append((S, path + 'S'))

        L = (number % 1000) * 10 + number // 1000
        if not visited[L]:
            visited[L] = True
            queue.append((L, path + 'L'))

        R = (number // 10) + (number % 10) * 1000
        if not visited[R]:
            visited[R] = True
            queue.append((R, path + 'R'))

T = int(input())

for _ in range(T):
    A, B = map(int, input().split())
    print(DSLR(A, B))
