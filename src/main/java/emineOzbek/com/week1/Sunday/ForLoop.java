package emineOzbek.com.week1.Sunday;

import java.util.List;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            //      System.out.println(i);
        }

        List<Integer> integerList = List.of(1, 4, 6, 9, 6);
        for (Integer i : integerList) {
            //    System.out.println(i);
        }

        int array[] = {25, 6, 89, 7, 9};
        for (int y : array) {
            //      System.out.println(y);
        }

        for (int i = 1; i < 10; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " değeri 5 ile tam bölünür.");
                break;
            }
//            System.out.println("Akış devam ediyor. Sayı: " + i);
        }
//        System.out.println("for döngüsünden çıktı.");


        for (int x = 1; x < 10; x++) {
            if (x % 5 == 0) {
                System.out.println(x + " değeri 5 ile tam bölünür.");
                continue;
            }
//            System.out.println("Akış devam ediyor. Sayı: " + x);
        }
        //    System.out.println("for döngüsünden çıktı.");


        for (; ; ) {
            System.out.println("döngü");
        }


    }


}






