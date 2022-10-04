import java.util.Scanner;
// Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
// a = 5; b = 7 -> max = 7
// a = 2 b = 10 -> max = 10
// a = -9 b = -3 -> max = -3
// * _событие_ старт
class task2{
    //          _событие_ старт </div>  
    public static void main(String[] args){
        String description="Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.";
        System.out.println(description);
        int min_o=0;
        int max_o=0;
        int temp_number;
//  декларируем сколько чисел сравнить  
        int task=3;
        int index;
// _//  каких чисел? Привести все к лонг?_
//  даем подсказку на ввод чисел по тз  
        System.out.println("В этот раз закроем глаза и представим что в мире есть только цифровые инпуты...");
        Scanner get_int_string = new Scanner(System.in);// ты щас серьёзно???
        for (index=0;index<task;index++){
            System.out.println("Введи число плз.");
            temp_number= Integer.parseInt(get_int_string.nextLine());
            if (index==0){
                min_o=temp_number;
                max_o=temp_number;
            }
            else {
                if (temp_number>max_o){
                    max_o=temp_number;
            }
            if (temp_number<min_o){
                    min_o=temp_number;
            }
        }
    }
    get_int_string.close();
    System.out.println("minimal value= "+min_o);
    System.out.println("maximal value= "+max_o);
// Декларируем сколько чисел сравнить//  каких чисел? Привести все к лонг?
// даем подсказку на ввод чисел по тз
// Декларируем условный максимум
// *декларируем условный минимум
// декларируем счетчик
// декларируем буфер входящих данных
// * начало цикла 1
// Принимаем ввод
// ввод численный?
// задаем его как максимум
// *задаем его как минимум
// начало цикла 2
// Пока счетчик меньше тз-1
// Принимаем ввод
// ввод численный? 
// Ввод больше максимума?
// Меняем максимум
// Ввод меньше минимума?
// меняем минимум
// печатаем мах=максимум
// *печатаем min=минимум

// * _событие_ финиш
    }
}