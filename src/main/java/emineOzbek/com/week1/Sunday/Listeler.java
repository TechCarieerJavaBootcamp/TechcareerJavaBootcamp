package emineOzbek.com.week1.Sunday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listeler {
    public static void main(String[] args) {


        int sayi = 5;
        List<String> isimler = new ArrayList<>();
        isimler.add("Sinan");
        isimler.add("Yağmur");
        isimler.add("HAsan"); //2
        isimler.add("Bekir");
        isimler.add("Ahmet");
        isimler.add(String.valueOf(sayi));

        System.out.println(isimler.contains("Ali"));
        List<String> ad = new ArrayList<>();
        ad.add("test");

        isimler.addAll(ad);
        System.out.println(isimler);


//        System.out.println(isimler.get(1));
//        System.out.println(isimler.size());

        for (int i = 0; i < isimler.size(); i++) {
            if (i == 2) {
                System.out.println("Silinen isim: " + isimler.get(i));
                isimler.remove(i);
            }
            System.out.println(isimler.get(i));
        }

        for (String isim : isimler) {

            System.out.println(isim);
        }


//        Arrays.asList();
//        List.of();


    }
}
