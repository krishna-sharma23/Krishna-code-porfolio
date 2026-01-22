
#Program to plot simple bar chart with customizations

import matplotlib.pyplot as plt

categories = ["Apple", "Banana", "Cherry", "Date", "Elderberry"]
values = [5, 7, 3, 8, 4]

plt.bar(categories, values, color='green', edgecolor='black')
plt.xlabel("Fruits")
plt.ylabel("Quantity")
plt.title("Fruit Quantity Bar Chart")
plt.show()