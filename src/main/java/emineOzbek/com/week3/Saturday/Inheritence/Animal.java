package emineOzbek.com.week3.Saturday.Inheritence;

public abstract class Animal {

    private String name;

    public void feed() {
        System.out.println("Animal is feed.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
