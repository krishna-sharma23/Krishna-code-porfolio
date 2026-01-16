#Anagram checker
first = input("Enter the first string").replace(" ","").lower()
second = input("Enter the second string").replace(" ","").lower()
fr = {}
sc = {}
for x in first:
    c=first.count(x)
    if x not in fr:
        fr[x]=c
for x in second:
    c=second.count(x)
    if x not in sc:
        sc[x]=c
if fr == sc :
    print("its an anagram")
else:
    print("Not an anagram")