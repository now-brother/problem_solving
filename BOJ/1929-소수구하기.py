def primeNum(num):
    if num == 1:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False

    return True

if __name__ == '__main__':
    m, n = map(int, input().split())

    for i in range(m, n + 1):
        if primeNum(i) == True:
            print(i)