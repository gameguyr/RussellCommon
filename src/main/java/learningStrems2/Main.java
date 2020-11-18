package learningStrems2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private List<Customer> customerList;

    public Main() {
        initializeCustomerList();
    }

    public static void main(String[] args) {
        new Main().streamCustomers();
    }

    private void streamCustomers() {
        //We have a pre-initialized list of Customer objects ready to go
        //See private List<Customer> customerList instance variable above

        //Step 1: Using streams, convert the list of customers to a list of Strings containing their 
        //first name and last name, in upper case
//        String myLambda = (Customer customer) -> {
//            return customer.getFirstName() + " " + customer.getLastName();
//        };
        List<String> myListStepOne = customerList.stream()
                .map(customer -> { return customer.getFirstName() + " " + customer.getLastName();})
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
//        List<String> myListStepOne = customerList.stream().forEach(Customer::getFirstName);


        //Step 2: display the contents of the list on the console
        System.out.println(myListStepOne);

        //step 3, split customers into two groups, one for premium customers and one for regular (non-premium) customers
        // Here is where I just returned a list but I want to do it like a Map
        List<Customer> myPremiumCustomerList = customerList.stream().filter(customer -> {return customer.getPremiumCustomer();}).collect(Collectors.toList());
//        System.out.println(myPremiumCustomerList);

        Map<Boolean, List<Customer>> myCustomerMap = customerList
                .stream()
                .collect(Collectors.groupingBy(customer -> {return customer.getPremiumCustomer();}));
        
        System.out.println(myCustomerMap);

        //Step 4, display a list of premium customers (i.e. customer.getPremiumCustomer() is true

        //Step 4, display a list of regular customers (i.e. customer.getPremiumCustomer() is false
    }

    private void initializeCustomerList() {
        customerList = new ArrayList<>();
        Customer customer1 = new Customer("Bruce", "Lee", 123, true);
        Customer customer2 = new Customer("Taylor", "Swift", 234, true);
        Customer customer3 = new Customer("Kevin", "Costner", 345, false);
        Customer customer4 = new Customer("Will", "Smith", 456, false);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
    }

}
