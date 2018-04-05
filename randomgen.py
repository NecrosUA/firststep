import random
import time

x = 0
y = 0

for i in range(100):
    value = random.randint(0, 1)
    if value == 1:
        x += 1
    else:
        y += 1
        time.sleep(0.1)
        print(value)

    if i == 99:
        print('Згенеровано нулів: '+str(y), ' Згенерировано одиниць: ' +str(x))
