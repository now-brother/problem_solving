string = input().split('-')

arr = []

for i in string:
    sum = 0
    x = i.split('+')
    for j in x:
        sum += int(j)
    
    arr.append(sum)

ans = arr[0]

for i in range(1,len(arr)):
    ans -= arr[i]

print(ans)