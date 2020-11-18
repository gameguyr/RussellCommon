package learningStrems2;

public class Customer {

    public Customer(String firstName, String lastName, Integer customerNumber, Boolean premiumCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.premiumCustomer = premiumCustomer;
    }

    private String firstName;
    private String lastName;
    private Integer customerNumber;
    private Boolean premiumCustomer;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Boolean getPremiumCustomer() {
        return premiumCustomer;
    }

    public void setPremiumCustomer(Boolean premiumCustomer) {
        this.premiumCustomer = premiumCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", customerNumber=" + customerNumber + ", premiumCustomer=" + premiumCustomer + '}';
    }

}
