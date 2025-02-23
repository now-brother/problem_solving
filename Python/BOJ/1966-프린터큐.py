from collections import deque

testcase = int(input())

for _ in range(testcase):
    n, m = map(int, input().split())
    arr = deque(map(int, input().split()))

    if n == 1:
        print(1)
    else:
        cnt = 1
        Flag = False
        while True:
            printNow = True
            for i in arr:
                if arr[0] < i:
                    arr.append(arr.popleft())
                    printNow = False
                    if m == 0:
                        m = len(arr) - 1
                    else:
                        m -= 1   
                    break
            if printNow == True:
                if m == 0:
                    print(cnt)
                    Flag = True
                    break
                else:
                    cnt += 1
                    arr.popleft()
                    m -= 1
            if Flag == True:
                break