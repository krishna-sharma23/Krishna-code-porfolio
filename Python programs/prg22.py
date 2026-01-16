#file handling
import os
file_path=f"exp/greetings.txt"
with open(file_path, "w")as file:
    file.write("Line one","\n")
    file.write("Line two","\n")
    file.write("Line three")