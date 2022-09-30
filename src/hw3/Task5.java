package hw3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
//Пользователь загадывает число в диапазоне от [2 до 100]
// Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
// Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
// В зависимоти от ответа пользователя принимает решения
// Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

        Scanner us = new Scanner(System.in);
        System.out.println("Загадайте и впишите число в диапазоне от [2 до 100]");
        int userCount = us.nextInt(); //пользователь вводит число

        Scanner an = new Scanner(System.in);
        System.out.println("Ответ да = 1, ответ нет = 0");
        int userAnswer = an.nextInt(); // ответы пользователя на вопросы системы

        int a = 2, b = 98, compAnswer = a + (int)(Math.random()*b);//программа выбирает число из диапазона [2;100]
                                                                    //compAnswer: ответы программы

        System.out.println("Число меньше 51?");
        userAnswer = an.nextInt();
         if(userAnswer == 1) {
             int otr1 = 51; // otr1: конечная точка диапазона [2;51]
             while(compAnswer != userCount && otr1 >= 2) {
                 if(compAnswer == userAnswer) System.out.println("Программа угадала");
                 else if(compAnswer <= (int)(otr1/2)) System.out.println(compAnswer = compAnswer/2);



                 otr1 --;
         }





        }




    }
}
