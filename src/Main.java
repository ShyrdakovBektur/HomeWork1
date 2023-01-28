import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String NAME = "Miraida";
        final int NUM = 101;
        String word = " rose";
        String Miraida = NUM + word;
        System.out.println(Miraida);
        System.out.println(NAME + " received " + NUM + word + " for her birthday ");

        if (NUM < 0) {
            System.out.println("Вы сохранили отрецательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }



















    }
}