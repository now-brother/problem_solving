arr = list(input())
visited = [0] * len(arr)
ans = 0

def findDuck(start):
    global ans
    prevArr = None
    qCnt = 0
    kCnt = 0
    for i in range(start, len(arr)):
        if visited[i] == 0 and arr[i] == 'q' and qCnt == 0:
            visited[i] = 1
            prevArr = arr[i]
            qCnt += 1
            continue
        elif visited[i] == 0 and arr[i] == 'q' and prevArr == 'k':
            visited[i] = 1
            prevArr = arr[i]
            continue
        if visited[i] == 0 and arr[i] == 'u' and prevArr == 'q':
            visited[i] = 1
            prevArr = arr[i]
            continue
        if visited[i] == 0 and arr[i] == 'a' and prevArr == 'u':
            visited[i] = 1
            prevArr = arr[i]
            continue
        if visited[i] == 0 and arr[i] == 'c' and prevArr == 'a':
            visited[i] = 1
            prevArr = arr[i]
            continue
        if visited[i] == 0 and arr[i] == 'k' and prevArr == 'c' and kCnt == 0:
            visited[i] = 1
            prevArr = arr[i]
            ans += 1
            kCnt += 1
            continue
        if visited[i] == 0 and arr[i] == 'k' and prevArr == 'c' and kCnt > 0:
            visited[i] = 1
            prevArr = arr[i]
            continue
if __name__ == "__main__":
    for i in range(len(arr)):
        if arr[i] == 'q' and visited[i] == 0:
            findDuck(i)

    if False in visited or ans == 0 or len(arr) % 5 != 0:
        print(-1)
    else:
        print(ans)
