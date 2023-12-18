package emineOzbek.com.week2.Sunday;

import java.util.HashSet;

public class HashCode {
    public static void main(String[] args) {


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Emine");
        hashSet.add("Dicle");
        hashSet.add(new String("Salih"));
        hashSet.add(new String("Salih"));

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person());
        personHashSet.add(new Person());

        String str = new String();
        str.equals("Emine");

        Person person = new Person();
        Person person2 = new Person();
        person.equals(person2);
        person.hashCode();

        HashSet<Person> personHashSet2 = new HashSet<>();
        personHashSet2.add(new Person());
        personHashSet2.add(new Person());

        String str2 = new String();
        str2.hashCode();


        Person person1 = new Person();
        person1.setFirstName("Okan");
        person1.age = 23;
        Person person3 = new Person();
        person3.setFirstName("Can");

        HashSet<Person> hashSet1 = new HashSet<>();
        hashSet1.add(person1);
        hashSet1.add(person3);


    }
}
