package emineOzbek.com.week2.Sunday.Oop;

public class CustomerService {

    public boolean admin;
    public int no;

    public CustomerService() {
        System.out.println("Müşteri servisi ayakta.");
    }

    public CustomerService(boolean admin) {
        this();
        this.admin = admin;
    }



    public CustomerService(boolean admin, int no) {
        this.admin = admin;
        this.no = no;
    }

    public void getCustomerData(){
        int customerNo =2;

        if(admin){
            System.out.println("Tüm veriyi getir.");
        } else {
            System.out.println("İsim ve numarayı getir.");
        }
    }

    public void getCustomerData(boolean admin){
        int customerNo =2;

        if(admin){
            System.out.println("Tüm veriyi getir.");
        } else {
            System.out.println("İsim ve numarayı getir.");
        }
    }

}
