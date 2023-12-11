package emineOzbek.com.week1.Sunday;

import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Girin: ");
        String name = scanner.next();
        System.out.println("Hoşgeldin " + name);


        while (true) {
            System.out.println("Almak istediğiniz ürünü girin: ");
            String product = scanner.next();
            System.out.println("Almak istediğiniz ürünün kg girin: ");
            int kilo = scanner.nextInt();
            System.out.println("Ürün: " + product + " KG " + kilo);

            int total = kilo * 5;
            System.out.println("Toplam Fiyat: " + total + "TL");

            System.out.println("Çıkmak için e tuşuna basın. Devam etmek için herhangi bir tuşa basın.");
            String exit = scanner.next();
            if (exit.equals("e")) {
                break;
            }

        }

    }
}
