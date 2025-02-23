def letsZ(n , r, c):
    if n == 0:
        return 0
    else:
        n -= 1

        box = (2 ** n) * (2 ** n)

        if r < 2 ** n and c < 2 ** n:
            return letsZ(n, r, c)
        elif r < 2 ** n and c >= 2 ** n:  
            return ( box * 1) + letsZ(n, r, c - ( 2 ** n ))
        elif r >= 2 ** n and c < 2 ** n:
            return ( box * 2) + letsZ(n, r - ( 2 ** n ), c)
        else:
            return ( box * 3 ) + letsZ(n, r - ( 2 ** n ), c - ( 2 ** n ))

if __name__ == "__main__":
    n, r, c = map(int, input().split())

    print(letsZ(n,r,c))