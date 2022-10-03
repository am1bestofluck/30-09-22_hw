to_compare=2
import random
task='__Тз Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.__'
print(task)
numbers=[]
for add_random_number in range(to_compare):
    _echo=random.choice(range(100))
    numbers.append(_echo)
    print(f'added {str(_echo)} to collection')
min_o,max_o=numbers[0],numbers[0]
for look_at_this in numbers[1:]:
    min_o=min(look_at_this,min_o)
    max_o=max(look_at_this,max_o)
print(f'min={min_o}')
print(f'max={max_o}')
