import java.util.Scanner;
class task4{
    public static void main(String[] args){
    String task="Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.";
    System.out.println(task);
    //     Днкларируем вводный буфе
    String limit_i="";
    // декларируем лимит шага по тз
    int limit_m=0;
    // декларируем шаг
    int step;//-1,1
    // Декларируем нулевой индекс// НЕ НАДО!
    // Приглашение ко вводу
    System.out.println("gimme number");
    Scanner get_input_number =new Scanner(System.in);
    String str_o="";
    boolean is_number=false;
        while (is_number!=true){
            System.out.println("дай число плз");
            String get_input=get_input_number.nextLine();
            try {
                limit_m=Integer.parseInt(get_input);
        } catch (NumberFormatException e) {
            System.out.println("not a number!");
        }
        finally {
            is_number=true;
            get_input_number.close();}
    }
    if (limit_m>0){
        step=1;
    }
    else{
        step=-1;
    }
    // начало цикла
    for(int index=1;index!=limit_m;index=index+step){
        if (index%2==0){
            str_o=str_o+String.valueOf(index)+", ";
        }
    }
    if (limit_m%2==0){
        str_o=str_o+String.valueOf(limit_m);
    }
    else{
        str_o=str_o.substring(0,str_o.length()-2);
    }
    System.out.println(str_o);
    // дали число? 
    // да: выход
    // Число больше нуля?
    // Да: шаг 1 нет: шаг -1
    // начало цикла: 
    // Индекс больше лимита?
    // да: выход
    // нет : индекс четный?
    // Да :печатаем индекс 
    // Индекс+шаг
    // Финиш
    }
}