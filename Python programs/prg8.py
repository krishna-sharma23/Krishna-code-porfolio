#prg to input a list from user and printing the frequency of all the elements
size=int(input("Enter the size of the list"))
lst=[]
u_ele=[]
num=0
for x in range(size):
    num=int(input(f"Enter the {x+1} Element"))
    lst.append(num)
for y in (lst):
    count=0
    for z in (lst):
        if y == z :
            count+=1
    if count != 0 and y not in u_ele:
        print(f"The number {y} appears {count} times")
        u_ele.append(y)