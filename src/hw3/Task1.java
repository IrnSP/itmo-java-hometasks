package hw3;

public class Task1 {
    public static void main(String[] args) {
        //Вывести все неотрицательные элементы последовательности 90 85 80 75 70 65 60 и тд
        for (int s1 = 90; s1 >= 0; s1 = s1-5) {
            System.out.println(s1);
        }

        //Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд

        for(int s2 = 2, step = 0; step < 10; step++, s2 += 2) {
                System.out.println(s2);
            }

        }
    }

