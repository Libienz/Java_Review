package inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        /*
        Customer customerLee = new Customer(10100,"Lee");


        Customer customerKim = new VIPCustomer(10101,"Kim",100);
        //업캐스팅 묵시적
        //customerKim.을해서 볼수있는건 Customer꺼

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());


         */
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customerLee = new Customer(10010,"이순신");
        Customer customerKim = new GoldCustomer(10011,"김박사");
        Customer customerPark = new VIPCustomer(10012,"박부상",100);

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerPark);


        for (Customer c : customerList) {
            System.out.println(c.showCustomerInfo());
        }



    }
}
