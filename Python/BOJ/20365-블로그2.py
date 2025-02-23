n = int(input())

arr = list(input())

cntb = 0
cntr = 0
for i in range(len(arr)):
    if i == 0 and arr[i] == 'B':
        cntb += 1
    elif i == 0 and arr[i] == 'R':
        cntr += 1
    elif arr[i] != arr[i - 1] and arr[i] == 'R':
        cntr += 1
    elif arr[i] != arr[i - 1] and arr[i] == 'B':
        cntb += 1

if cntb > cntr:
    ans = cntr + 1
else:
    ans = cntb + 1

print(ans)