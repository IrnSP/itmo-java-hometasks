package hw1;
/* Даны две переменные типа double: время (в часах) и расстояние (в километрах).
Найти и вывести в консоль скорость, выраженную в метрах в секунду
 */

public class Task3 {
    public static void main(String[] args) {
        // time= 2.4 час, distance = 17.8 км
        double time = 2.4,  distance = 17.8;
        double speed = (distance*1000)/(time*3600);
        System.out.println("Скорость, м/с:" + speed);
    }
}
