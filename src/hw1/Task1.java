package hw1;
//Даны длина, ширина и высота прямоугольного параллелепипеда. Найти и вывести в консоль его площадь.

public class Task1 {
    public static void main(String[] args) {
        // length = a, width = b, high = c, s = square;
        double a = 123.4, b = 24.8, c = 45.9, s = 2 * (a * b + b * c + a * c);
        System.out.println("Площадь поверхности параллелепипеда:");
        System.out.println(s);
        System.out.println("Формулировка задачи с точки зрения математики не точна. " +
                "Параллелепипед - объемная фигура, у него не площадь, а площадь поверхности. " +
                        "Да, я зануда :)");
    }
}
