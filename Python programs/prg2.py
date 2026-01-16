#program to check for palindrome
word=input("The word to be checked")
output=""
x=len(word)-1
while x > -1:
    output=output+word[x]
    x-=1
if output == word:
    print("It's a palindrome")
else:
    print("It's not a palindrome")