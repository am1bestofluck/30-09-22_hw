// Старт
import java.text.ParsePosition;
import java.util.Scanner;

import javax.swing.plaf.ActionMapUIResource;
class task3{
     
    public static void main(String[] args) {
        String task="Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).";
        System.out.println(task);
        //  декларируем вывод // четное
        String field_o;
        int actually_number=0;
        // декларируем логическую проверку
        // boolean is_even;
        // Приглашение ко вводу СОКРАЩЕННОЕ
        Scanner get_input_number =new Scanner(System.in);
        // начало цикла
        boolean is_number=false;
        while (is_number!=true){
            System.out.println("дай число плз");
            String get_input=get_input_number.nextLine();
            try {
                actually_number=Integer.parseInt(get_input);
                is_number=true;
        } catch (NumberFormatException e) {
            System.out.println("not a number!");
        }
        if (actually_number%2==0){
            // is_even=true;
            System.out.println("Number "+String.valueOf(actually_number)+" is even!");
        }
        else {
            // is_even=false;
            System.out.println("Number "+String.valueOf(actually_number)+" is odd!");
        }
        // введено число?
        // да: выход
        // остаток от деления 0?
        // Нет : меняем вывод на Нечетное
        // пишем вывод
        // Финиш"
    }
}
}