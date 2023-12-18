package emineOzbek.com.week2.Sunday.Oop;

public class Ogretmen {

    public Long id;

    public String name;
    public int age;

    public Ogretmen() {
      //  System.out.println();
    }

//    public Ogretmen(Long id) {
//        this.id = id;
//    }

    public void setAge(int age) {
        this.age = age;
        return;
    }

    public int getAge() {
        //code
        return age;
    }


    public void okulaGider(){
        System.out.println("Yürüyerek gidr");
    }


}
