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
        int count = 8, iteration = 10;
        Scanner al = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 9");
        int userNumber = al.nextInt();
        if(userNumber < 0) System.out.println("Введите корректное значение числа от 1 до 9");
        if(userNumber > 9) System.out.println("Введите корректное значение числа от 1 до 9");


       while(iteration > 0) {
           if(userNumber > count) System.out.println("загаданное число меньше");
           if(userNumber < count) System.out.println("загаданное число больше");
           iteration--;

       }
        if(userNumber == 0) System.out.println("выход из программы");
        if(userNumber == count) System.out.println("Вы угадали");


        // получился красивый бесконечный цикл, т.к. я не понимаю, каким образом тут сделать счётчик





    }
}
