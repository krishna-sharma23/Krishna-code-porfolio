
#Program to plot simple line graph with customizations
import matplotlib.pyplot as plt

x = [2023, 2024, 2025, 2026, 2027]
y = [10, 12, 20, 27, 15]

customization = {'marker': 'o', 'color': 'blue', 'linestyle': '--'}

plt.grid()
plt.plot(x, y, **customization)
plt.xlabel("Year")
plt.ylabel("Value")
plt.title("Sample Plot")
plt.show()