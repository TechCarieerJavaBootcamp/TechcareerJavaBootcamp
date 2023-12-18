package emineOzbek.com.week2.Sunday.DesignPattern;


public class BuilderDesignPattern {
    public static void main(String[] args) {

        Student2 student2 = Student2.builder().firstName("Okan").lastName("Sinan").build();
    }
}
