n = int(input())
sum = 0

arr = list(map(int, input().split()))
arr.sort(reverse = True)
sum += arr[0]

for i in range(n-1):
    sum += (arr[i+1] / 2)
    
if sum % 1 == 0:
    print(int(sum))
else:
    print(sum)