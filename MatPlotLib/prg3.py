import matplotlib.pyplot as plt
import numpy as np

categories = ['1st year', '2nd year', '3rd year', '4th year']
values = np.array([50, 70, 40, 90])

plt.pie(values, labels=categories, autopct='%1.1f%%', startangle=140, shadow=True,
        explode=(0.01, 0.01, 0.01, 0.01), colors=['#ff9999','#66b3ff','#99ff99','#ffcc99'])
plt.title("Student Distribution by Year")   
plt.axis('equal')
plt.show()