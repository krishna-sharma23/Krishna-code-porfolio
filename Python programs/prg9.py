#Pattern1
height=int(input("Enter the Height of the triangle"))
for x in range(height):
    for y in range(x+1):
        print("*", end="")
    print("")