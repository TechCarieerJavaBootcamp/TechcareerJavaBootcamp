package emineOzbek.com.week2.Saturday;

public class Kapsam {

    public int variable = 5;            //Nesne
    public static int variable2 = 4;    //Class


    public static void main(String[] args) {

        toplama(3, 5);


    }

    public static void toplama(int sayi1, int sayi2) {

        int toplam = sayi1 + sayi2;
        System.out.println(toplam);


        for (int i = 0; i < 10; i++) {

            i = 5;
            toplam += i;
            System.out.println(i);
        }


    }

}
