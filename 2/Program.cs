﻿using static System.Console;
// Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
//   _событие_ старт  
WriteLine("Задача 2");
//  декларируем сколько чисел сравнить  
// _//  каких чисел? Привести все к лонг?_
int task = 3;
string blank="";
//  даем подсказку на ввод чисел по тз  
Write("Введите ");
Write(task);
Write(" чисел!");
//  Декларируем условный максимум
int max_val;
//  *декларируем условный минимум
// int min_val;
//  декларируем счетчик
int counter = 0;
//  декларируем буфер входящих данных
string buffer_i = "";
int buffer_m;
//  * начало цикла 1
//     Принимаем ввод
//      ввод численный?
bool correct_number = false;
while (!correct_number)
{
    WriteLine(blank);
    WriteLine("дай число плиз!");
    buffer_i = ReadLine();
    correct_number = int.TryParse(buffer_i, out buffer_m);
    if (correct_number) break;
}
//          задаем его как максимум
//          *задаем его как минимум
buffer_m=Int32.Parse(buffer_i);
max_val=buffer_m;
//  начало цикла 2
//      Пока счетчик меньше тз-1
while (counter<task-1)
{
//          Принимаем ввод
//              ввод численный? 
    correct_number=false;
    while (correct_number!=true)
    {
        WriteLine("дай число плиз!");
        buffer_i = ReadLine();
        correct_number = int.TryParse(buffer_i, out buffer_m);
        // if (correct_number) break;
    }

    buffer_m=Int32.Parse(buffer_i);
//                  Ввод больше максимума?
//                         Меняем максимум  
    if (buffer_m>max_val) max_val=buffer_m;
    counter++;
}

//  печатаем мах=максимум  
Write("max=");
Write(max_val);
//  * _событие_ финиш 