package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//Считать с консоли количество тарелок и моющего средства.
//Моющее средство расходуется из расчета 0.5 на 1 тарелку (за один раз расходуется 0.5 стредства и 1 тарелка).
//В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
//После цикла вывести сколько тарелок и моющего средства осталось.
        /// "Защита от дурака" (стр. 17 и 23) работает некрасиво и некорректно, т.к.
        /// я не знаю, остановить выполнение кода, до тех пор, пока не будет введено корректное значение

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите количество тарелок, целое число больше нуля");
        int plateNumber = in1.nextInt();
        if(plateNumber < 0) System.out.println("Введите корректное значение числа тарелок: целое число, больше 0");


        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите количество моющего средства, положительное число кратно 0.5");
        float qtyWash = in2.nextFloat();
        if(qtyWash < 0.5) System.out.println("Введите корректное значение моющего ср-ва: положительное число, кратно 0.5");

        while(plateNumber > 0) {
            if (qtyWash > ((float)(plateNumber)*0.5)) System.out.println("Остаток моющего средства:");
            if (qtyWash == 0) break;
            System.out.println(qtyWash - 0.5);
            plateNumber --;
            qtyWash = (float)(qtyWash - 0.5);
        }

        if (qtyWash == 0) System.out.println("Нет моющего средства");

        System.out.println("Осталось тарелок:");
        System.out.println(plateNumber);
        System.out.println("Осталось моющего средства:");
        System.out.println(qtyWash);



    }


}
