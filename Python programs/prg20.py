#Compressing a string
st=input("Enter a word or a sentence")
output=""
for char in st:
    temp=st.count(char)
    if char not in output:
        c=str(temp)
        output=output+char+c
if len(st) <= len(output):
    print(f"The String {st} is already compressed")
elif len(st) > len(output):
    print(f"{output} is your compressed string")
