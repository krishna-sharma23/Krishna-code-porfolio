#a program to compress and decompress string
#compress
"""def compress():
    word=input("Enter the word to be compressed")
    output=""
    count=1
    for x in range(1,len(word)):
        if word[x]==word[x-1]:
            count+=1
        else:
            output+=word[x-1]+str(count)
            count=1
    output+=word[x]+str(count)
    print(output)
compress()
"""
#decompress
def decompress():
    word=input("Enter the word ot be decompressed")
    output=""
    temp=0
    for x in range(len(word)):
        if word[x].isnumeric():
            print(word[x])
            temp=int(word[x])
            for i in range(temp):
                output+=word[x-1]
    print(output)
decompress()