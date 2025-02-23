t = int(input())

arr = []
for i in range(t):
    arr.append([0,0])

for i in range(t):
    arr[i][0], arr[i][1] = map(int, input().split())

for i in range(t):
    print("Case #" + str(i+1) + ": " + str(arr[i][0] + arr[i][1]))