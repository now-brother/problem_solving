T = int(input())

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def BFS(x, y):
    queue = [(x,y)]
    ground[x][y] = 0 # 방문처리

    while queue:
        x,y = queue.pop(0)

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= M or ny < 0 or ny >= N:
                continue

            if ground[nx][ny] == 1 :
                queue.append((nx,ny))
                ground[nx][ny] = 0

for _ in range(T):
    M, N, K = map(int, input().split())
    ground = [[0]*N for _ in range(M)]

    ans = 0
    for _ in range(K):
        x, y = map(int, input().split())
        ground[x][y] = 1
    
    for x in range(M):
        for y in range(N):
            if ground[x][y] == 1:
                BFS(x,y)
                ans += 1
    
    print(ans)