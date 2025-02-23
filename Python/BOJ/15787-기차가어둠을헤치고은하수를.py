if __name__ == "__main__":
    n, m = map(int, input().split())
    train = [[0 for _ in range(20)] for _ in range(n)]
    ans = 0
    ansCheck = []

    for _ in range(m):
        command = list(map(int, input().split()))
        if command[0] == 1:
            train[command[1] - 1][command[2] - 1] = 1
        elif command[0] == 2:
            train[command[1] - 1][command[2] - 1] = 0
        elif command[0] == 3:
            for j in range(19, 0 ,-1):
                train[command[1] - 1][j] = train[command[1] - 1][j - 1]
            train[command[1] - 1][0] = 0
        elif command[0] == 4:
            for j in range(19):
                train[command[1] - 1][j] = train[command[1] - 1][j + 1]
            train[command[1] - 1][19] = 0
            
    for i in range(n):
        if train[i] not in ansCheck:
            ans += 1
            ansCheck.append(train[i])

    print(ans)
