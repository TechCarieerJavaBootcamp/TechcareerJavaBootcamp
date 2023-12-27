package emineOzbek.com.week3.Saturday.Interface;

public interface SendMessage {

    public void sendSms();

    public  void sendMail();

    public default void defaultMethod(){

    }

    public static void staticMethod(){

    }

}
