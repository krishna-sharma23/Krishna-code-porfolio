"""adding up the digits of a given number
num=input("Enter the number")
x=0
sum=0
y=0
while x < len(num):
    y=int(num[x])
    sum+=y
    x+=1
print(f"The sum of the digits of the number is: {sum}")"""
#adding up the digits of a given number
num=int(input("Enter the number"))
x=0
sum=0
while num > 0:
    x=num%10
    sum+=x
    num=num//10
print(f"The sum of the digits of the number is: {sum}")
