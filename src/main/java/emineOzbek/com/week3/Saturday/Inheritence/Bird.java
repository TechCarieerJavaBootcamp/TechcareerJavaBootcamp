package emineOzbek.com.week3.Saturday.Inheritence;

public class Bird extends Animal{

    @Override
    public void feed() {
        super.feed();
        System.out.println("Bird is feed.");
    }

    public void fly(){
        System.out.println();
    }



}
