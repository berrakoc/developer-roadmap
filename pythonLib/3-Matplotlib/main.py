import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
import random

#scatter plots
'''
x_data= np.random.random(50) * 100
y_data= np.random.random(50) * 100

plt.scatter(x_data, y_data, c='red', marker='*', s=10, alpha=0.3  )
plt.show()
'''

#line plots
'''
years= [2006 + x for x in range (16)]
weights = [80, 83, 84, 85, 86, 82, 81, 79, 83, 80, 82, 82, 83, 81, 80, 79]

plt.plot(years, weights, 'r--', lw=3)
#plt.plot(years, weights, c='g', lw=3, linestyle= "--") #plot uses lines as default, linewidth
#plt.scatter(years, weights)
plt.show()
'''

#bar plots
'''
x= ["C++", "C#", "Python", "Java", "Go"]
y = [20, 50, 140, 1, 45]

plt.bar(x, y, color="r", align="edge", width=0.5, edgecolor="green", lw=6)
plt. show()
'''

#histograms
'''
ages= np.random.normal(20,1.5,1000)
#mean, std. dev., ..

#plt.hist(ages, bins=[ages.min(), 18, 21, ages.max()])
plt.hist(ages, bins=20, cumulative=True)
plt.show()
'''

#pie charts
'''
#all decisions should be seperate
langs= ["Python", "C++", "Java", "C#", "Go"]
votes= [50,24,14,6,17]
explodes= [0.3, 0.1, 0, 0, 0]
plt.pie(votes, labels=langs, explode=explodes,
        autopct="%.2f%% ", pctdistance=0.8, startangle=90)
#pctdistance = pct how far away from the center
#startangle goes COUNTERclockwise
plt.show()
'''

#boxplots

'''heights= np.random.normal(172, 8, 300)

plt.boxplot(heights)
plt.show()
'''
#Plot Customization
'''
years = [2014, 2015, 2016, 2017, 
         2018, 2019, 2020, 2021]

income= [55, 56, 62, 61, 
         72, 72, 73, 75]

income_ticks = list(range(50, 81,2))

plt.plot(years, income)
plt.title("Income of John (in USD)", fontsize=30, fontname= "FreeSerif")
plt.xlabel("Year")
plt.ylabel("Yearly Income in USD")
plt.yticks(income_ticks, [f"${x}k" for x in income_ticks])

plt.show()
'''

#Legends & Multiple Plots
'''
stock_a = [100, 102, 99, 101, 101, 100, 102]
stock_b = [90, 95, 102, 104, 105, 103, 109]
stock_c = [110, 115, 100, 105, 100, 98, 95]

plt.plot(stock_a, label="Stock A")
plt.plot(stock_b, label="Stock B")
plt.plot(stock_c, label="Stock C")

plt.legend(loc="lower center") #adds label, you can reposition it
plt.title("Stock Price Over Time")
plt.xlabel("Days")
plt.ylabel("Price")
plt.grid(True)


plt.show()
'''

#Multiple Figures
'''
x1, y1= np.random.random(100), np.random.random(100)
x2, y2= np.arange(100), np.random.random(100)

plt.figure(1)
plt.scatter(x1,y1)

plt.figure(2)
plt.plot(x2, y2)

plt.show()
'''

#subplots
'''
x = np.arange(1, 101)  #common x
fig, axs = plt.subplots(2, 2) #2x2 matrix

axs[0, 0].plot(x, np.sin(x))
axs[0, 0].set_title("Sine Wave") #set_title

axs[0, 1].plot(x, np.cos(x))
axs[0, 1].set_title("Cosine Wave")

axs[1, 0].plot(x, np.random.random(100))
axs[1, 0].set_title("Random Function")

axs[1, 1].plot(x, np.log(x))
axs[1, 1].set_title("Log Function")
axs[1, 1].set_xlabel("TEST")

plt.tight_layout()  # prevents overlapping

fig.suptitle("Four Plots")
plt.savefig("fourplots.png", dpi=300,
            transparent=True) #dpi for the quality
plt.show()
'''

#3d plotting
'''
ax= plt.axes(projection="3d")

x=np.random.random(100)
y=np.random.random(100)
z=np.random.random(100)

ax.scatter(x, y, z)
ax.set_title("3D Plot")
ax.set_xlabel("test")
plt.show()'''
'''
ax = plt.axes(projection="3d")

x = np.arange(-5, 5, 0.1)
y = np.arange(-5, 5, 0.1)
X, Y = np.meshgrid(x, y)
Z = np.sin(X) * np.cos(Y)
ax.plot_surface(X, Y, Z, cmap='viridis')

ax.set_title("3D Plot")
ax.set_xlabel("X Axis")
ax.set_ylabel("Y Axis")
ax.set_zlabel("Z Axis")

ax.view_init(azim=0, elev=90) #default view from the top
plt.show()
'''

#animating plots
heads_tails = [0,0]

for _ in range(100000):
  heads_tails[random.randint(0,1)] += 1
  plt.bar(["Heads", "Tails"], heads_tails, color=["red", "blue"])
  plt.pause(0.001)
plt.show()