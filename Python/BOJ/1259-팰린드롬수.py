while True:
    n = input()

    if n == '0':
        break

    arr = []

    for i in range(len(n)):
        arr.append(n[i])

    condition = True

    for i in range(len(arr) // 2 + 1):
        if arr[i] == arr[len(arr) - 1 - i]:
            continue
        else:
            condition = False
            break

    if condition == True:
        print('yes')
    else:
        print('no')

