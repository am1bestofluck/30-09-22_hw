import java.util.Random;
import java.util.Scanner;
class task1{
    //          _событие_ старт </div>  
    public static void main(String[] args){
        String description="__Тз Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.__";
        System.out.println(description);
        
//  декларируем сколько чисел сравнить  
        int task=2;
// _//  каких чисел? Привести все к лонг?_
//  даем подсказку на ввод чисел по тз  
        System.out.println("В этот раз закроем глаза и представим что в мире есть только цифровые инпуты...");
        System.out.println("Введи число плз.");
        Scanner get_int_string = new Scanner(System.in);// ты щас серьёзно???
        int number0= Integer.parseInt(get_int_string.nextLine());
        int min_o=number0;
        int max_o=number0;
        System.out.println("Введи число плз");
        int number1=Integer.parseInt(get_int_string.nextLine());
        System.out.println(number0);
        System.out.println(number1);
        get_int_string.close();
        
//  Декларируем условный максимум
//  *декларируем условный минимум
//  декларируем счетчик
//  декларируем буфер входящих данных
//  * начало цикла 1
//     Принимаем ввод
//  ввод численный?
//  задаем его как максимум
//  *задаем его как минимум
//  начало цикла 2
//  Пока счетчик меньше тз-1
//  Принимаем ввод
//  ввод численный? 
//  Ввод больше максимума?
// Меняем максимум  
//  Ввод меньше минимума?  
// меняем минимум  
//  печатаем мах=максимум  
//  *печатаем min=минимум  
// <div class="start"> * _событие_ финиш </div>
}
}