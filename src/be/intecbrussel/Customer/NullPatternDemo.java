package be.intecbrussel.Customer;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomersName("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomersName("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomersName("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomersName("Subject00");

        System.out.println("Customers:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
