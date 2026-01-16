from tkinter import *
def plus():
    x=int(label['text'])
    x+=1
    label.config(text=str(x))
def minus():
    x=int(label['text'])
    x-=1
    label.config(text=str(x))
window=Tk()
#window.geometry("420x420")
window.title("Counter")
label=Label(window,text="0",font=("Comic Sans", 30, "bold"))
label.grid(row=0,column=0,columnspan=2)
b1=Button(window,text="+1",font=("Comic Sans", 30, "bold"),command=plus)
b1.grid(row=1,column=0,padx=5,pady=5)
b2=Button(window,text="-1",font=("Comic Sans", 30, "bold"),command=minus)
b2.grid(row=1,column=1,padx=5,pady=5)
window.mainloop()