# character frequency dictionary
sen=input("Enter the sentence").replace(" ","").upper()
dic = {}
for x in sen:
    c=sen.count(x)
    if x not in dic:
        dic[x]=c
print("----------------Frequency----------------")
for value in dic:
    print(f"{value:<5}:{dic.get(value):>5}")