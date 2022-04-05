import random
n = input("Enter n\n")
f = open("input2.txt", "w")

f.write(str(n)+" "+str(n)+"\n")
for i in range(0, n):
    for _ in range(0, n):
        f.write(str(random.randint(-1000, 1000))+" ")
        # f.write("0 ")
    f.write("\n")
f.close()