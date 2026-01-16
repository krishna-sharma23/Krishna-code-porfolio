#Making the first letter of each word capital
sen=input("Enter the sentence").strip()
sen=" "+sen
output=""
for x in range(len(sen)):
    if sen[x-1] == " ":
        char=sen[x].upper()
    else:
        char=sen[x]
    output=output+char
output=output.strip()
print(output)