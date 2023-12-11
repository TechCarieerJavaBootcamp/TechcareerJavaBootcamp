package emineOzbek.com.week1.Sunday;

public class MantiksalOperatorler {

    public static void main(String[] args) {

        /**
         * Ve : a && b
         * Veya : a || b
         * Değil : !(a&&b)
         */

        int a = 5;
        int b = 4;
        int c = 5;
        int d = 4;
        System.out.println((a == c) && (b == d));
        System.out.println((a == b) && (b == c));
        System.out.println((a == b) || (a == c));
        System.out.println((a != b) && (b == d));

    }
}
