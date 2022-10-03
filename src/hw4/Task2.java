package hw4;
import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //Создайте массив из чётных чисел [2;20]
        // и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for(int arr2Index = ((arr2.length)-1); arr2Index < arr2.length && arr2Index >= 0 ; arr2Index--) {
            System.out.println(arr2[arr2Index]);

        }

    }



}
