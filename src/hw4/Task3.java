package hw4;
import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
        //и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
        //В итоге в массиве будут только уникальные слова
        //Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен.
        //Перед завершением программы, вывести получившийся массив в консоль

        String[] stringS = new String[5]; // пустой массив на 5 слов
        stringS = new String[]{"true", "false", "java", "жава", "Ö!"};
        String exit = "exit"; // выход по слову "exit"
        Scanner wo = new Scanner(System.in);


        for (int strIndex = 0; strIndex < stringS.length; strIndex++) {
            System.out.println("Введите слово");
            String word = (wo.nextLine());


            boolean result; result = (stringS[strIndex]).equals(word);   // Переменная для метода equals. True - равны

            if ("exit".equals(word)) {
                stringS[strIndex] = stringS[strIndex];
                System.out.println("Выход из программы");
                System.out.println(Arrays.toString(stringS));
                break;
            }
            if (result = true) {
                stringS[strIndex] = word;
            }
            if (result = false) {
                stringS[strIndex] = stringS[strIndex];
                System.out.println("Слово уже есть в массиве, введите другое:");
                wo.nextLine();

            }
            System.out.println(Arrays.toString(stringS));
        }
    }
}
