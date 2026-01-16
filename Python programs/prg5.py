#program to find the prime numbers between 1 to 100
for x in range(2, 101):
    y=0
    for i in range(1, x+1):
        if x%i == 0:
            y+=1
    if y<=2:
        print(x)
