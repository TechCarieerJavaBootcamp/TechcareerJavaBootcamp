package emineOzbek.com.week1.Sunday;

public class Practices {
    public static void main(String[] args) {


        int number = 1;

        while (number < 10) {
//            System.out.println("10'dan küçüktür.");
            if (number * 2 == 10) {
//                System.out.println("eşittir");
                break;
            }
            number++;
        }

        int sayi = 6;
        switch (sayi) {
            case 1:
                System.out.println("Ali");
                break;
            case 2:
                System.out.println("Ahmet");
            case 3:
                System.out.println("Ayşe");
                break;
            case 4:
                System.out.println("Veli");
            case 6:
                System.out.println("Kuzey");
            default:
                System.out.println("Emine");
        }


        int result = 0;
        for (int i = 1; i <= 5; i++) {
            result = result * i;
        }
        System.out.println(result);

        int sonuc = 0;
        for (int i = 1; i <= 5; i++) {
            sonuc = sonuc + i;
        }
        System.out.println(sonuc);


    }
}
