package emineOzbek.com.week2.Sunday.DesignPattern;

public class Client {
    public static void main(String[] args) {

        Student student = new Student.Builder().id(1212L).firstName("Emine").lastName("Özbek").build();
        Student student2 = new Student.Builder().firstName("Emine").lastName("Özbek").build();
        Student student3 = new Student.Builder().firstName("Emine").lastName("Özbek").age(22).build();

    }
}
