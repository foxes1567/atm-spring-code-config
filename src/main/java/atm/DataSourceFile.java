package atm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataSourceFile implements DataSource {

    public Map<Integer,Customer> readCustomers() {

        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1,new Customer(1,"Peter",1234,1000));
        customers.put(2,new Customer(2,"Katherine",2345,2000));
        customers.put(3,new Customer(3,"Chris",3456,3000));

        return customers;
    }
}
