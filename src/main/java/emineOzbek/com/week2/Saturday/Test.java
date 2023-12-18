package emineOzbek.com.week2.Saturday;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        Kapsam.variable2 =4;
//
//        Kapsam kapsam = new Kapsam();
//        kapsam.variable = 4;

        try {
            List<Object> objectList = new ArrayList<>();
            int objectSize = 100000000; // Nesne boyutu (örneğin, 1 MB)

            int i = 0;
            while (true) {
                byte[] largeObject = new byte[objectSize];

                objectList.add(largeObject);
                System.out.println("i. " + i++);
            }
        } catch (OutOfMemoryError e) {

            System.out.println("Heap belleği aşırı derecede kullanıldı. Program sonlandırılıyor.");
        }
    }
}
