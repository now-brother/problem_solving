if __name__ == '__main__':
    n = int(input())

    arrInput = []
    for i in range(n):
        arrInput.append(int(input()))

    ans = []
    count = 1
    arr = []

    Flag = True

    for i in range(n):
        while count <= arrInput[i]:
            arr.append(count)
            ans.append('+')
            count += 1
        if arr[-1] == arrInput[i]:
            arr.pop()
            ans.append('-')
        else:
            Flag = False

    if Flag == False:
        print('NO')
    else:
        for i in ans:
            print(i)