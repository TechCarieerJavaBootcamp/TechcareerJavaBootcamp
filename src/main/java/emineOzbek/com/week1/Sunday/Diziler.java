package emineOzbek.com.week1.Sunday;

public class Diziler {

    public static void main(String[] args) {

        Integer[] sayiDizisi = new Integer[3];
        sayiDizisi[0] = 2;
        sayiDizisi[1] = 5;
        sayiDizisi[2] = 25;

        Integer[] dizi = {1, 5, 8, 6, 7};

        int length = dizi.length;
//        System.out.println(length);

        int[] array = new int[3];
        char c = 'c';
        String name = "Emine";
        long x = 10;

        array[0] = c;

        Integer[] integers = new Integer[5];
        integers[0] = 5;
        integers[1] = 23;
        integers[2] = 12;
        integers[3] = 213;
        integers[4] = 2156;

        for (int i = 0; i <= integers.length - 1; i++) {
            int eleman = integers[i];
            System.out.println(eleman);
        }

        String[] isimler = {"Mustafa", "Muhammed", "Emre"};
        for (String isim : isimler) {
            System.out.println(isim);
        }


    }
}
