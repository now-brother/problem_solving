num = int(input())
arr365 = [0 for i in range(366)]
arrInput = []
ans = 0

for i in range(num):
    arrInput.append(list(map(int, input().split())))

for i in range(num):
    x = arrInput[i][0]
    y = arrInput[i][1] - arrInput[i][0] + 1
    for j in range(y):
        arr365[x + j - 1] += 1

width = 0
height = 0

for i in arr365:
    if i != 0:
        width += 1
        if i > height:
            height = i
    if i == 0:
        ans += width * height
        width = 0
        height = 0

print(ans)