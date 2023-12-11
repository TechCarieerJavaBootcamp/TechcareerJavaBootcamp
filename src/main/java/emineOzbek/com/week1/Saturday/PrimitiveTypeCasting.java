package emineOzbek.com.week1.Saturday;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        // Verileri Büyükten küçüğe veya küçükten büyüğe çevirebiliriz.

        byte byteValue = 127;
        short shortValue = 129;
        shortValue = byteValue;
        System.out.println("shortValue : " + shortValue);

        int intValue = 1_000_000;
        long longValeu = 100L;
        intValue = (int) longValeu;
        System.out.println("intValue: " + intValue);

        //Büyükten küçüğe geçişlerde cast işlemi yapılır.

        //  intValue = (int) longValeu;
        //  System.out.println("cast edilmemiş değer: " + longValeu);
        //  System.out.println("intValue: " + intValue);


        Integer value1 = 10;
        Integer value2 = 10;

        System.out.println(value1 == value2);  // Integer bir obje olduğu == ile referansların eşitliği kontrol edilir.


    }
}
