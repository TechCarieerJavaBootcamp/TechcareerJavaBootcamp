package emineOzbek.com.week2.Sunday;

import java.util.Objects;

public class Person {

    //    public Long id;
    public String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int setFirstName1(String firstName) {
        return 2;
    }

    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, age);
    }


}
