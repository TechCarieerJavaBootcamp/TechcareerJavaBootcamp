package emineOzbek.com.week1.Sunday;

import java.util.Random;

public class IfElseConditional {
    public static void main(String[] args) {

        int a = 10;
        int b = 27;

        if (b == 10) {
            System.out.println("a 10'a eşittir.");
        } else {
            System.out.println("else'e girdi.");
        }

        Random random = new Random();
        int sayi = random.nextInt(100);

        if (sayi < 40) {
            System.out.println("Sayı 40'tan küçüktür.");
        } else if (sayi > 40 && sayi < 50) {
            System.out.println("sayı 40 ile 50 arasındadır.");
        } else {
            System.out.println("Sayı 50'den büyüktür.");
        }

        int total = a + b;
        if (total < 40) {
            System.out.println("Sayı 40'tan küçüktür.");
        } else if (total > 35 && total < 50) {
            System.out.println("sayı 40 ile 50 arasındadır.");
        } else {
            System.out.println("Sayı 50'den büyüktür.");
        }

        boolean allow = false;

        if (allow) {
            System.out.println("İzin verildi.");
        } else {
            System.out.println("İzin verilmedi.");
        }

        int number = 3;
        if (number > 10) {
            System.out.println("number 10'dan büyüktür.");
        } else {
            System.out.println("number 10'dan küçüktür.");
        }

        String result = number > 10 ? "number 10'dan büyüktür." : "number 10'dan küçüktür.";
        System.out.println(result);

    }
}
