package emineOzbek.com.week1.Sunday;

import java.time.LocalDate;
import java.util.Formatter;
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {

        Random random = new Random();
        int sayi;

        do {
            sayi = random.nextInt(10);
            System.out.println("sayi: " + sayi);
        } while (sayi < 7);

        System.out.println("Döngüden çıktı");


    }
}
