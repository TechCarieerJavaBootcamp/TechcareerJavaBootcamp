package emineOzbek.com.week3.Saturday.Interface;

public class XCompany implements SendMessage, Test{

    @Override
    public void sendSms() {
        System.out.println("Bu sms X şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void sendMail() {
        System.out.println("Bu mail X şirketi tarafından gönderilmiştir.");

    }

    @Override
    public void defaultMethod() {
        Test.super.defaultMethod();
    }
}
