import random, time  # import random library and time library

zero_count = 0
one_count = 0

step = input("Введіть кількість ітерацій: ")  # create input from keyboard called "step"

while not step.isdigit() or int(step) <= 0 or int(step) > 1000:
    print("Будьласка введіть ціле чило, але не більше 1000")
    step = input("Спробуйте ще раз: ")  # Another try until information will be correct

for x in range(0, int(step)):  #Loop x in range from 1 before "step"
    time.sleep(0.5)  # waiting 0.5 sec
    x = random.randint(0, 1)  # rondomize numbers between 0 and 1
    if x == 0:
        zero_count += 1
    else:
        one_count += 1
    print(x)  # print result on display

print("Згенеровано нулів: %s" % zero_count)
print("Згенеровано одиниць: %s" % one_count)