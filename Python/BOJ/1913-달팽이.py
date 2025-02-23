if __name__ == "__main__":
    n = int(input())
    ans = int(input())

    snail = [[0]*n for _ in range(n)]
    locX = n // 2
    locY = n // 2
    snail[locX][locY] = 1

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    direction = 0
    num = 2
    repeatTime = 1
    
    while True:
        for _ in range(2):
            if direction == 4:
                direction = 0
            for _ in range(repeatTime):
                locX += dx[direction]
                locY += dy[direction]
                snail[locX][locY] = num
                num += 1
            direction += 1
        repeatTime += 1
        if repeatTime == n:
            flag = True
            if direction == 4:
                direction = 0
            for _ in range(n - 1):
                locX += dx[direction]
                locY += dy[direction]
                snail[locX][locY] = num
                num += 1
                flag = False
            if flag == False:
                break
                
    for i in range(n):
        print(*snail[i])

    for i in range(n):
        flag = True
        for j in range(n):
            if snail[i][j] == ans:
                print(i + 1, j + 1)
                flag = False
                break
        if flag == False:
            break
