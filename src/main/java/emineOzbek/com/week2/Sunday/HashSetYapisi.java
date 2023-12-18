package emineOzbek.com.week2.Sunday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetYapisi {

    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Emine");
        stringList.add("Dicle");
        stringList.add("Salih");
        stringList.add("Mert");

        for(String isim : stringList ){
            System.out.println("İsim: " + isim);
        }
        System.out.println(stringList.size());


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Emine");
        hashSet.add("Dicle");
        hashSet.add("Salih");
        hashSet.add("Salih");
        hashSet.add("Murat");
        hashSet.add("Cavit");

        for(String name :hashSet){
            System.out.println("İsim: " + name);

        }

        System.out.println(hashSet.size());

    }
}
