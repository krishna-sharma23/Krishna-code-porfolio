#String program
sen=input("Enter a string").replace(" ","").lower()
most_fre=""
fre=0
for x in sen:
    temp=sen.count(x)
    if temp > fre:
        fre=temp
        most_fre=x
print(f"Most frequent character is: {most_fre}")
print(f"Frequency: {fre}")