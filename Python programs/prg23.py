#array
size=10
l1=[]
l2=[]
for x in range(0,size):
    l1.append("*")
for y in range(size):
    l2.append(l1)
for list in l2:
    print(list)