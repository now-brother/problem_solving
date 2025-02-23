def PrimeNum(x):
    for i in range(2,x):
        if x % i == 0:
            return False
    return True

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))

    cnt = 0
    for i in arr:
        if i == 1:
            continue
        elif PrimeNum(i) == True:
            cnt += 1

    print(cnt)