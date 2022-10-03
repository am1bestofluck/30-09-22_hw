// Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает 
// все чётные числа от 1 до N.
using static System.Console;
int get_decimal_input(){
//копипаста из третьей задачи. А как импортировать то :(
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
// Старт
WriteLine("Задача 4");

// декларируем лимит шага по тз
int step_limit;
// декларируем шаг
int step;
int index;
// Приглашение ко вводу

// Число больше нуля?
// Да: шаг 1 нет: шаг -1
step_limit=get_decimal_input();
if (step_limit<0)
{
    step=-1;
}
else
{
    step=1;
}
int last_viable_index;
if (step_limit%2==0)
{
    last_viable_index=step_limit;
}
else
{
    last_viable_index=step_limit-step;
}
for (index=1;index!=step_limit+step;index=index+step)
{
    if (index!=last_viable_index) 
    {
        if (index%2==0) Write(String.Concat(index,", "));
    }
    else
    {
        if (index%2==0) Write(index);
    }
}
WriteLine("\n\nНу алгоритм Я конечно написал, но он, как бы помягче сказать, \"не пригодился\".");
WriteLine("Передаю пламенный привет отсутвию запятой после последнего элементом. Гори в аду:).");
WriteLine("Если шагаем назад, то 0 появляется в выдаче, потому что в задании явно указано что шагать нужно от +1.");