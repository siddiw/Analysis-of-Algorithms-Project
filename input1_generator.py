import random
n = input("Enter n\n")
f = open("input1.txt", "w")

f.write(str(n)+"\n")
for i in range(0, n):
    f.write(str(random.randint(-10000, 10000))+" ")
f.close()