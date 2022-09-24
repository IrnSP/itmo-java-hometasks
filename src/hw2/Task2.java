package hw2;

public class Task2 {
    public static void main(String[] args) {
        /* Дана переменная sum - сумма покупки и переменная saleCode - номер купона.
        Если номер купона равен 4525 - вывести сумму с учетом скидки 30%
        Если номер купона равен 6424 или 7012 - вывести сумму с учетом скидки 20%
        Если номер купона равен 7647 или 9011 или 6612 - вывести сумму с учетом скидки 10%
        В остальных случаях скидка не предусмотрена, вывесть полную стоимость покупки. */

        int sum = 100, saleCode = 1234;
        switch (saleCode) {
            case 4525:
                System.out.println(sum*0.7);
                break;
            case 6424:
                System.out.println(sum*0.8);
                break;
            case 7012:
                System.out.println(sum*0.8);
                break;
            case 7647:
                System.out.println(sum*0.9);
                break;
            case 9011:
                System.out.println(sum*0.9);
                break;
            case 6612:
                System.out.println(sum*0.9);
                break;
            default:
                System.out.println(sum);
        }

    }
}
