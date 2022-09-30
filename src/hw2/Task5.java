package hw2;

public class Task5 {
    public static void main(String[] args) {
        //написать код, который будет проверять попало ли случайно сгенерированное
        //целое число из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.

        int a = 10, b = 490; //начальное и конечное число отрезка [10;500]
        int random = a + (int)(Math.random()*b);
        if (random > 25 && random <200) System.out.println("Число:" + random + ". В интервале (25;200)" );
        else System.out.println("Число:" + random + ". Не в интервале (25;200)");
    }
}
