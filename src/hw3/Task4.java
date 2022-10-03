package hw3;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        //Программа загадывает число в диапазоне [1;9]
        //Пользователь вводит число с клавиатуры
        //Программа в зависимости от введенного числа выводит в консоль следующее:
        //"загаданное число больше"
        //"загаданное число меньше"
        //"Вы угадали" (программа завершает работу)
        //Если введен 0, выввести "выход из программы" (программа завершает работу)

        int a = 1, b = 8, random = a + (int)(Math.random()*b);// задали диапазон случайных чисел [1;9]

        Scanner al = new Scanner(System.in); // число пользователя, заданное с клавиатуры

       while(true) {
           System.out.println("Введите целое число от 1 до 9");
           int userNumber = al.nextInt();

           if(userNumber == 0) {
               System.out.println("Программа завершила работу");
               break;
           }

           if (userNumber == random) {
               System.out.println("Вы угадали");
               break;
           }
           if (userNumber >0  && userNumber <= 9 && userNumber > random) {
               System.out.println("загаданное число меньше");
               continue;
           }
           if(userNumber > 0 && userNumber <= 9 && userNumber < random) {
               System.out.println("загаданное число больше");
               continue;
           }
           if(userNumber > 9 || userNumber < 1 ) {
               System.out.println("Введите корректное значение числа от 1 до 9");
               continue;

           }

           }


       }


    }

