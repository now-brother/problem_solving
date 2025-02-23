first = input()
second = input()
third = input()

if first!="Fizz" and first!="Buzz" and first!="FizzBuzz":
    ansNum = int(first) + 3
elif second!="Fizz" and second!="Buzz" and second!="FizzBuzz":
    ansNum = int(second) + 2
else:
    ansNum = int(third) + 1

if(ansNum%3==0 and ansNum%5==0):
    print("FizzBuzz")
elif(ansNum%3==0):
    print("Fizz")
elif(ansNum%5==0):
    print("Buzz")
else:
    print(ansNum)