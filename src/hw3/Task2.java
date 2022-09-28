package hw3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int userNumber = in.nextInt();

            while(userNumber > 0) { // я понимаю про циклы, но я не понимаю, какие здесь должны быть арифметические
                // действия для выполнения задачи. Потому здесь просто бесконечный цикл, не имеющий отношение к задаче,
                // просто чтобы IDEA не мешала запускать Run в других классах :)
                System.out.println(userNumber*2);
                userNumber --;
            }
        int summ = userNumber*2;
        System.out.println(summ);

    }






    }


