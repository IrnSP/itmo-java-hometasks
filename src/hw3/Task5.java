package hw3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
//Пользователь загадывает число в диапазоне от [2 до 100]
// Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
// Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
// В зависимоти от ответа пользователя принимает решения
// Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

        Scanner an = new Scanner(System.in);

         int start = 2, end = 101, middle;

            while(true) {
                middle = (start + end)/2;
                System.out.println("число равно " + middle + "?");
                int userAnswer = an.nextInt();
                if(userAnswer == 1) {
                    System.out.println("Программа угадала число!");
                    break;
                }
                System.out.println("число больше " + middle + "?");
                userAnswer = an.nextInt();
                if(userAnswer == 1) start = middle;
                else if(userAnswer == 0) end = middle;
            }







    }
}
