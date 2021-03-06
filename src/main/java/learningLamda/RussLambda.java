package learningLamda;

import learningLamda.pojo.Customer;
import learningLamda.pojo.Employee;
import learningLamda.pojo.Person;
public class RussLambda {

    private Person person;
    private Customer customer;
    private Employee employee;

    public static void main(String[] args) {
        RussLambda main = new RussLambda();
        main.initializePeople();
        main.doStuff();
    }

    private void doStuff() {

        //Step 1, write a functional interface named NameExtractor, have
        //it accept an instance of Person or any of its subclasses
        //Its abstract method should be called getName() end return a String
        //
        //Step 2: write an implementation of NameExtractor for instances of Person as a lambda expression
        //have the body of the lambda return the result of Person.getLastName()


        NameExtractor<Person> personNameExtractor  = (Person person) -> {
            return person.getLastName();
        };

//        System.out.println(personNameExtractor.getName(person));



        //Step 2: write an implementation of NameExtractor for instances of Customer as a lambda expression
        //have the body of the lambda return the result of Person.getFirstName() and Person.getLastName()

        NameExtractor<Customer> customerNameExtractor = (Customer customer) -> {
            return customer.getFirstName() + " " + customer.getLastName();
        };

        //Step 3: write an implementation of NameExtractor for instances of Employee as a lambda expression
        //have the body of the lambda return the result of Person.getFirstName()

        NameExtractor<Employee> employeeNameExtractor = (Employee employee) -> {
            return employee.getFirstName();
        };

        //Step 4: display the output of the three Functional interfaces you created,
        //passing the prepopulated "person", "customer" and "employee" instance variables

        System.out.println(personNameExtractor.getName(person));
        System.out.println(customerNameExtractor.getName(customer));
        System.out.println(employeeNameExtractor.getName(employee));
    }

    private void initializePeople() {
        person = new Person();
        customer = new Customer();
        employee = new Employee();

        person.setFirstName("John");
        person.setLastName("Wayne");
        customer.setFirstName("Salma");
        customer.setLastName("Hayek");
        employee.setFirstName("Tom");
        employee.setLastName("Cruise");
    }

}
