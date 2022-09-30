package hw2;

public class Task1 {
    public static void main(String[] args) {
        //Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года
        int month = 11;
        if(month >=1 && month <3) System.out.println("Winter");
        else if(month ==12) System.out.println("Winter");
        else if(month >=1 && month < 6)System.out.println("Frühling");
        else if(month >=1 && month < 9)System.out.println("Sommer");
        else if(month >=1 && month <= 11) System.out.println("Herbst");
        else System.out.println("Fehler. Nur positive ganze Zahlen von 1 bis 12");

    }
}
