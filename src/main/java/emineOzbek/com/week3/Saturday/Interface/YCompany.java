package emineOzbek.com.week3.Saturday.Interface;

public class YCompany implements SendMessage, Test{

    @Override
    public void sendSms() {
        System.out.println("Bu sms Y şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void sendMail() {
        System.out.println("Bu mail Y şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void defaultMethod() {
        SendMessage.super.defaultMethod();
    }
}
