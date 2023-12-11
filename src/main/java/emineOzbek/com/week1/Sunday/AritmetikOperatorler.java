package emineOzbek.com.week1.Sunday;

public class AritmetikOperatorler {
    public static void main(String[] args) {

        int carpma = 2 * 4;
        System.out.println("carpma: " + carpma);

        int bolme = 10 / 3;
        System.out.println("bolme: " + bolme);

        double bolmeD = 10.0 / 3.0;
        System.out.println("bolmeD: " + bolmeD);

        int mod = 10 % 3;
        System.out.println("mod: " + mod);

        double modDouyble = 10 % 3;
        System.out.println("modDouyble: " + modDouyble);

        int i = 7;
        int y = i + 3;

        i = i + 2;
        i += 2;

        i = i - 2;
        i -= 2;


        i = i + 1;
        i += 1;
        i++;


        int x = 1, t = 2, z = 3;

        z = x + t * z;
        System.out.println("z: " + z);

        z = (x + t) * z;
        System.out.println("z: " + z);

        int sayi = 5;
        int sayi2 = sayi++;
        System.out.println("sayi: " + sayi);
        System.out.println("sayi2: " + sayi2);

        int sayi3 = 5;
        int sayi4 = ++sayi3;
        System.out.println("sayi3: " + sayi3);
        System.out.println("sayi4: " + sayi4);


        int a = 2;
        int b = 3;
        int c = ++b;
        int d = a++;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);


        System.out.println("a" + "b");
        System.out.println("20" + "30");
        System.out.println(30 + 30 + "c");
        System.out.println("c" + 20 + 30);
        System.out.println(20 + 30 + "a" + 30 + 20);

    }
}
