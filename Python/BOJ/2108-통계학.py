import math
import sys

n = int(sys.stdin.readline())

arr = []
for _ in range(n):
    arr.append(int(sys.stdin.readline()))
arr.sort(reverse = False)

sum = 0
for i in range(n):
    sum += arr[i]

print(round(sum/n))
print(arr[int((n-1)/2)])

counts = dict()
for i in range(1,n+1) :
	counts[i] = []

maxCount = 1
count = 1
for j in range(1,n) :
	if arr[j] == arr[j-1] :
		count += 1
	else :
		counts[count].append(arr[j-1])
		if maxCount < count : maxCount = count
		count = 1
	if j == n-1 : 
		counts[count].append(arr[j])
		if maxCount < count : maxCount = count

if n == 1 :
	counts[1].append(arr[0])

counts[maxCount].sort()
if len(counts[maxCount]) == 1 :
	print(counts[maxCount][0])
else :
	print(counts[maxCount][1])

print(arr[-1] - arr[0])