if __name__ == "__main__":
    arr = list(input())
    change = arr[0]
    arrLength = len(arr)
    count = 0

    for i in range(arrLength):
        if change != arr[i]:
            change = arr[i]
            count += 1

    if count % 2 == 1:
        count += 1
        print(count // 2)
    else:
        print(count // 2)
