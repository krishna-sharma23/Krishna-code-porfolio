#prg to input a list from user and create a new list that only contain unique element
size=int(input("Enter the size of the list"))
lst=[]
u_ele=[]
num=0
for x in range(size):
    num=int(input(f"Enter the {x+1} Element"))
    lst.append(num)
print(f"Original list is: {lst}")
for y in (lst):
    count=0
    for z in (u_ele):
        if y == z :
            count+=1
    if count == 0 :
        u_ele.append(y)
print(f"List with unique elements is: {u_ele}")


