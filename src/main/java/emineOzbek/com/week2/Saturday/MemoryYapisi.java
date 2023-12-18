package emineOzbek.com.week2.Saturday;

import java.util.ArrayList;
import java.util.List;

public class MemoryYapisi {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Emine");
        person.setAge(26);

        int a = 3;
        int b = a;
        a = 4;
        System.out.println("a'nın değeri: " + a);
        System.out.println("b'nın değeri: " + b);

        String str1 = new String("a");
        String str2 = new String("b");
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("temp: " + temp);

        // pass-by-value or pass-by-referance

        Person person1 = new Person();
        person1 = null;

      //  stackOverFlowExp(1);
        heapMemory();

    }

    public static void stackOverFlowExp(int num) {
        System.out.println("Number: " + num);
        if (num == 0) {
            return;
        } else {
            stackOverFlowExp(num += 1);
        }
    }

    public static void heapMemory() {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (true) {
            String name = new String("Emine");

            System.out.println(i + "." + name);
           // list.add(name);
            i++;
        }
    }


}
