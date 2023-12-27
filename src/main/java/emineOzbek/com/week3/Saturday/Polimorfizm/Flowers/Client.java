package emineOzbek.com.week3.Saturday.Polimorfizm.Flowers;

public class Client {
    public static void main(String[] args) {

//        Rose rose = new Rose();
//        rose.color="red";
//        rose.dikenli=true;
//
//
//        Flower daisy = new Daisy();  //UpCasting
//        Daisy daisy1 =(Daisy) daisy;
//        daisy.color="White";
//        daisy.smell();

        Flower flower = new Rose();
        Rose rose1 = (Rose) flower;   //DownCasting
        rose1.smell();
        rose1.color = "White";
        rose1.test();




    }
}
