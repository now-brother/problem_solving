from collections import deque

def plusToAnswer(arr):
    arrLength = len(arr)
    for i in range(arrLength):
        arr[i] += 1
    return arr

def lengthIsTwo(arr, arr1):
    for i in range(2):
        if arr[i] % 2 == 1:
            arr1 = plusToAnswer(arr1)
    sum = arr[0] + arr[1]
    if sum % 2 == 1:
        arr1 = plusToAnswer(arr1)
    return arr1

def LengthMoreThanTwo(arr, arr1):
    arrLength = len(arr)
    sum = 0
    while arrLength > 2:
        arrLength = len(arr)
        for i in range(arrLength)
            if arr[i] % 2 == 1:
                sum +=1
        for i in range(1,arrLength):
            for j in range(i+1,arrLength):
                
    arr1.append(sum)



    return arr, arr1

if __name__ == "__main__":
    queue = deque(int(input()))
    ans = deque()

    while True:
        if  len(queue) == 1:
            if queue[0] % 2 == 1:
                ans = plusToAnswer(ans)
                break
        elif len(queue) == 2:
            ans = lengthIsTwo(queue, ans)
            break
        else:
            queue, ans = LengthMoreThanTwo(queue, ans)
    ans.sort()    
    print(ans[0], ans[-1])