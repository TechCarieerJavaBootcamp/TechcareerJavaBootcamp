package emineOzbek.com.week2.Sunday.Oop;

public class CustomerClient {
    public static void main(String[] args) {

//        CustomerService customerService = new CustomerService();
//     //   customerService.admin = true;
//        customerService.getCustomerData(true);
        //code

        CustomerService customerService2 = new CustomerService(true);
        customerService2.getCustomerData();
        customerService2.getCustomerData(false);

    }
}
