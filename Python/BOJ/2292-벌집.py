n = int(input())

i = 0
cal = 1
while True:
    cal += 6 * i

    if n <= cal:
        print(i + 1)
        break
    i += 1