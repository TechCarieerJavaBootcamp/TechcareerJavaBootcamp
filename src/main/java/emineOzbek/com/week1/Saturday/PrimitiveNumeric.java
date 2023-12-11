package emineOzbek.com.week1.Saturday;

import java.math.BigDecimal;

public class PrimitiveNumeric {
    public static void main(String[] args) {

        //Tam Sayılar

        byte byteValue = 127;

        System.out.println("byte value: " + byteValue);

        short shortValue = 10000;

        int sayi = 556464654;
        System.out.println("int value: " + sayi);

        int sayiValue = 10_000_000;
        System.out.println("int value: " + sayiValue);

        long longValue = 73429452454933L;
        System.out.println("long value:" + longValue);


        // Noktalı Sayılar

        float floatValue = 1.1f;

        double doubleValue = 1.1;

        double totalDouble = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("totalDouble: " + totalDouble);

        float totalFloat = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("totalFloat: " + totalFloat);

        BigDecimal bigDecimalValue = BigDecimal.valueOf(3);

    }
}
