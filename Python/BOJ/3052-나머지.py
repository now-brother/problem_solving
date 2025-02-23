def delete(arr):
    while True:
        i = 0
        if i == len(arr) - 2:
            break
        elif arr[i] == arr[i + 1]: 
            del(arr[i])
            print(arr)
        else:
            i += 1

    return arr

if __name__ == '__main__':
    arr = []
    for i in range(10):
        arr.append(int(input()))

    result = []
    for i in range(10):
        result.append(arr[i] % 42)

    result.sort()

    i = 0

    while True:
        if i == len(result) - 2:
            if result[i] == result[i + 1]:
                del(result[i])
            break
        elif result[i] == result[i + 1]: 
            del(result[i])
        else:
            i += 1

    print(len(result))