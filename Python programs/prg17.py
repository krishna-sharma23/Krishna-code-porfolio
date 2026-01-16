#vowel and consonant counter
sen=input("Enter the sentence").replace(" ","").upper()
vowel=0
consonant=0
for x in sen:
    if x in "AEIOU":
        vowel+=1
    else:
        consonant+=1
print(f"Vowel = {vowel}")
print(f"Consonant = {consonant}")