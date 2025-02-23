from collections import deque

def bfs(x, y, maze, dx, dy):
    queue = deque()
    queue.append((x,y))
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx >= 0 and nx < n and ny >= 0 and ny < m:
                if maze[nx][ny] == 1:
                    maze[nx][ny] = maze[x][y] + 1
                    queue.append((nx, ny))
        
    return maze[n - 1][m - 1]

if __name__=="__main__":
    n, m = map(int, input().split())
    maze = []
    for i in range(n):
        maze.append(list(map(int, input())))
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    ans = bfs(0, 0, maze, dx, dy)

    print(ans)
