// Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).
using static System.Console;
// Старт 
WriteLine("Задача 3");
// декларируем вывод // четное
string str_o="ЧЕТНОЕ";
// декларируем логическую проверку
int get_decimal_input(){
    bool local_check_number=false;
    int number_o=0;
    string number_i;
    // начало цикла
    while (local_check_number!=true){
        // Приглашение ко вводу СОКРАЩЕННОЕ
        WriteLine("Дай число плз");
        // введено число?
        // да: выход
        number_i=ReadLine();
        local_check_number=Int32.TryParse(number_i, out number_o);
    }
    return number_o;
}
int number_main=get_decimal_input();
// остаток от деления 0?
// Нет : меняем вывод на Нечетное
if (number_main%2!=0) str_o="нечетное";
// пишем вывод
Write(String.Concat("Число ",number_main," ",str_o.ToUpper()));
WriteLine("");
// Финиш