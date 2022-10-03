import random
task='Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.'
print(task)
result=''
limit=random.choice(range(-100,100,1))
if limit>0:
    step=1
else:
    step=-1
for number_to_analyze in range(1,limit+step,step):
    if  not number_to_analyze%2:
        result+=str(number_to_analyze)+", "
result=result[:-2]
print(f'We got {str(limit)}')
print( result)