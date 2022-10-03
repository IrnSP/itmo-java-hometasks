package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//Считать с консоли количество тарелок и моющего средства.
//Моющее средство расходуется из расчета 0.5 на 1 тарелку (за один раз расходуется 0.5 стредства и 1 тарелка).
//В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
//После цикла вывести сколько тарелок и моющего средства осталось.

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите кол-во тарелок, целое число больше нуля:");
        int plateNumber = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите кол-во моющего средства, число больше 0.5:");
        float qtyWash = in2.nextFloat();

        while (plateNumber <= 0 || qtyWash <= 0) {
            System.out.println("Введите корректное значение количества тарелок, целое число больше нуля:");
            plateNumber = in1.nextInt();
            System.out.println("Введите корректное кол-во моющего средства, число больше 0.5:");
            qtyWash = in2.nextFloat();
         }


        while (plateNumber > 0 && qtyWash >= 0.5) {
            System.out.println("Остаток моющего средства:" + (qtyWash - 0.5));
            plateNumber--;
            qtyWash -= 0.5;
        }

        if (qtyWash >= 0 && qtyWash < (plateNumber * 0.5)) System.out.println("Недостаток моющего ср-ва!");
        System.out.println("Осталось тарелок:" + plateNumber);
        System.out.println("Осталось моющего средства:" + qtyWash);




    }


}
