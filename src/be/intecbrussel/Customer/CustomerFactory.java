package be.intecbrussel.Customer;

public class CustomerFactory {
    final static String[] customersNames = {"Subject00", "Subject01", "Subject02", "Subject03", "Subject04", "Subject05"};

    public static AbstractCustomer getCustomersName (String name){
        for (String arrCN:customersNames) {
            if (arrCN.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
