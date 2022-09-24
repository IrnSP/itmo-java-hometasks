package hw2;

public class Task1 {
    public static void main(String[] args) {
        //Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года
        int month = 5;
        if (month==1) System.out.println("Winter");
        else if (month==2) System.out.println("Winter");
        else if (month==12) System.out.println("Winter");
        else if (month==3) System.out.println("Frühling");
        else if (month==4) System.out.println("Frühling");
        else if (month==5) System.out.println("Frühling");
        else if (month==6) System.out.println("Sommer");
        else if (month==7) System.out.println("Sommer");
        else if (month==8) System.out.println("Sommer");
        else if (month==9) System.out.println("Herbst");
        else if (month==10) System.out.println("Herbst");
        else if (month==11) System.out.println("Herbst");
        else System.out.println("Fehler. Nur positive ganze Zahlen von 1 bis 12");

    }
}
