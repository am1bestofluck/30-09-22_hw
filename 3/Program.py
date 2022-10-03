import random
task='Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).'
print(task)
incoming_number,response=random.choice(range(100000)),{True:"odd",False:"even"}
print(f'We got {str(incoming_number)}. It is {response[incoming_number%2]}!')
