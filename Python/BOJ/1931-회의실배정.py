import sys

n = int(input())

arr = []

for _ in range(n):
    a, b = map(int, sys.stdin.readline().rstrip().split())
    arr.append([a,b])

arr.sort(key=lambda x : (x[1], x[0]))

lastMeeting = 0
ans = 0

for startMeeting, endMeeting in arr:
    if lastMeeting <= startMeeting:
        ans += 1
        lastMeeting = endMeeting

print(ans)