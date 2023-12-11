package emineOzbek.com.week1.Saturday;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    public static void main(String[] args) {

        int sayi = 100;
        Integer sayi2 = 100;

        sayi2.toString();
        System.out.println(sayi2.toString());

        String stringValue = "100";
        String stringValue2 = "200";

        Integer integerValue = Integer.valueOf(stringValue);
        int parseInt = Integer.parseInt(stringValue2);

        int result = integerValue + parseInt;
        System.out.println("Sonuç: " + result);

        int min = Integer.min(234, 565);
        System.out.println(min);

        double doubleValue = 0.3;
        Double doubleValue2 = 0.5;

        boolean bool = true;
        Boolean boolean2 = false;

        // Autoboxing And Unboxing

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }

        List<Integer> listInteger = new ArrayList<>();
        int total = 0;
        for (Integer i : listInteger) {
            total += i;
        }

    }


}
