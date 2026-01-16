#String program
word=input("Enter a word")
reverse=""
v=0
for x in range(len(word)-1,-1,-1):
    reverse=reverse + word[x]
    if word[x].lower() in "aeiou":
        v+=1
print(f"Uppercase: {word.upper()}")
print(f"Reversed: {reverse}")
print(f"Vowel count: {v}")
print(f"Palindrome: {"Yes" if reverse == word else "No"}")