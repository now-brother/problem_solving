n, m = map(int, input().split())

arr_n = map(int, input().split())
arr_n = list(arr_n)

for i in range(m):
    arr = []
    arr = map(int, input().split())
    arr = list(arr)
    if arr[0] == 1:
        arr_n[arr[1]-1] = arr[2]
    elif arr[0] == 2:
        for i in range(arr[1]-1,arr[2],1):
            if arr_n[i] == 0:
                arr_n[i] = 1
            else:
                arr_n[i] = 0
    elif arr[0] == 3:
        for i in range(arr[1]-1,arr[2],1):
            arr_n[i] = 0
    elif arr[0] == 4:
        for i in range(arr[1]-1,arr[2],1):
            arr_n[i] = 1

print(*arr_n)
