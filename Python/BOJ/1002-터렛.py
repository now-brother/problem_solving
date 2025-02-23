import math

if __name__ == "__main__":
    n = int(input())

    for i in range(n):
        x1, y1, r1, x2, y2, r2 = map(int, input().split())
        distCircle = math.sqrt((x2 - x1)**2 + (y2 - y1)**2)


        if distCircle == 0 and r1 == r2:
            print(-1)
        elif distCircle == r1 + r2 or abs(r2 - r1) == distCircle:
            print(1)
        elif abs(r2 - r1) < distCircle < r1 + r2:
            print(2)
        else:
            print(0)

