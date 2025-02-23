import sys

def my_round(val):
  if val - int(val) >= 0.5:
    return int(val)+1
  else:
    return int(val)

n = int(sys.stdin.readline().strip())
if n:
  arr = []
  for _ in range(n):
    arr.append(int(sys.stdin.readline().strip()))

  nn = my_round(n*0.15)
  arr.sort()
  if nn > 0:
    print(my_round(sum(arr[nn:-nn])/len(arr[nn:-nn])))
  else:
    print(my_round(sum(arr)/len(arr)))
else:
  print(0)