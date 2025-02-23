T = int(input())

for _ in range(T):
    h, w, n = map(int, input().split())
    if n % h == 0:
        cal = h * 100 + (n // h)
    else:
        cal = (n % h) * 100 + (n // h) + 1

    print(cal)