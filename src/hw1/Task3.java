package hw1;
/* Даны две переменные типа double: время (в часах) и расстояние (в километрах).
Найти и вывести в консоль скорость, выраженную в метрах в секунду
 */

public class Task3 {
    public static void main(String[] args) {
        // time= 2.4 час, distance = 17.8 км
        double time1 = 2.4, time = time1 * 3600, distance1 = 17.8, distance = distance1 * 1000,speed = distance / time;
            System.out.println("Скорость, м/с:");
            System.out.println(speed);
    }
}
