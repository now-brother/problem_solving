n = int(input())
arr = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))
arr.sort()

for i in arr2:
    start, end = 0, n - 1
    Flag = False

    while start <= end:
        mid = (start + end) // 2
        if i == arr[mid]:
            Flag = True
            print(1)
            break
        elif i > arr[mid]:
            start = mid + 1
        else:
            end = mid - 1
        
    if Flag == False:
        print(0)
