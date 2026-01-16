#pattern4
height=int(input("Enter the Height of the triangle"))
temp=height
for x in range(height):
    num=1
    for y in range(temp):
        print(" ",end="")
    for z in range(x*2+1):
        print(num, end="")
        if z < x:
            num+=1
        else:
            num-=1
    print("")
    temp-=1
for x in range(height,-1,-1):
    num=1
    for y in range(temp):
        print(" ",end="")
    for z in range(x*2+1):
        print(num, end="")
        if z < x:
            num+=1
        else:
            num-=1
    print("")
    temp+=1
