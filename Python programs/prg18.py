#Longest word
sen=input("Enter the sentence")
t=0
large=0
longest=""
words=sen.split()
for word in words:
    t=len(word)
    if large < t:
        large=t
        longest=word
print(f"The longest word in the entered sentence is: {longest}")
