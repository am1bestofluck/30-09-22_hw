task='Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.'
print(task)
to_compare=3
import random
numbers=[]
for add_random_number in range(to_compare):
    _echo=random.choice(range(100))
    numbers.append(_echo)
    print(f'added {str(_echo)} to collection')
min_o,max_o=numbers[0],numbers[0]
for look_at_this in numbers[1:]:
    # min_o=min(look_at_this,min_o)
    max_o=max(look_at_this,max_o)
# print(f'min={min_o}')
print(f'max={max_o}')
