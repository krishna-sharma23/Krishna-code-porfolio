#program to find out the largest digit in a number
num=input("Enter the number")
large=0
for digit in num:
        if large < int(digit):
            large=digit
print(f"the largest digit in the number is {large}")

