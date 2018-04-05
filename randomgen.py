import random
import time

zero_count = 0
one_count = 0

for i in range(100):
    value = random.randint(0, 1)
    
    if value == 1:
        one_count += 1
    else:
        zero_count += 1
        
    time.sleep(0.1)
    print(value)

    if i == 99:
        print('Згенеровано нулів: '+str(zero_count), ' Згенерировано одиниць: ' +str(one_count))
