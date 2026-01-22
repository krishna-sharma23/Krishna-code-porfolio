
#Scatter Plot Example

import matplotlib.pyplot as plt
import numpy as np

x1 = np.array([5, 7, 8, 7, 2, 17, 2, 9, 4, 11, 12, 9, 6])
y1 = np.array([99, 86, 87, 88, 100, 86, 103, 87, 94, 78, 77, 85, 86])

x2 = np.array([15, 17, 18, 17, 12, 27, 12, 19, 14, 21, 22, 19, 16])
y2 = np.array([89, 76, 87, 78, 90, 56, 93, 87, 84, 79, 77, 85, 86])

plt.scatter(x1, y1, c='blue', s=100, label='Class 1')
plt.scatter(x2, y2, c='red', s=100, label='Class 2')

plt.xlabel('Number of Hours Studied')
plt.ylabel('Scores Obtained')
plt.title('Study Hours vs Scores')

plt.legend()
plt.show()