package emineOzbek.com.week1.Sunday;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {

        Random random = new Random();
        int sayi = random.nextInt(10);

        while (sayi < 7) {
            System.out.println("Sayı: " + sayi);
            sayi = random.nextInt(10);
        }

        double sayi2 = random.nextDouble();
        while (sayi2 < 0.3) {
            System.out.println("Sayı2: " + sayi2);
            sayi2 = random.nextDouble();
        }


    }
}
