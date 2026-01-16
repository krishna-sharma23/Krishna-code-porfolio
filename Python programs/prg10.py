#pattern2
height=int(input("Enter the Height of the triangle"))
temp=height
for x in range(height):
    for y in range(temp):
        print(" ",end="")
    for z in range(x*2+1):
        print("*", end="")
    print("")
    temp-=1