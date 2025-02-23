n = int(input())
m = int(input())
s = input()

ans = 0
cnt = 0
index = 0

while index < m-1:
    if s[index:index+3] == "IOI":
        cnt += 1
        index += 2
        if cnt == n:
            ans += 1
            cnt -= 1
    else:
        index += 1
        cnt = 0

print(ans)