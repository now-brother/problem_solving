x, y, w, h = map(int, input().split())

arr = []

arr.append(w - x)
arr.append(x)
arr.append(h - y)
arr.append(y)

arr.sort()

print(arr[0])