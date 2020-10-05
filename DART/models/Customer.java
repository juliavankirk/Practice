package DART.models;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class Customer {
    private UUID Id;
    private String name;

    public Customer(String name) {
        Id = UUID.randomUUID(); // we don't need user input to make an ID, therefore it's not a parameter in constructor
        this.name = name;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public HashMap<UUID, Customer> customers;

    public Collection<Customer> getCustomerList() {
        return customers.values();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public void removeCustomer(UUID id) {
        customers.remove(id);
    }

    public Customer findCustomer(UUID id) {
        Customer customer = customers.get(id);
        if (customer == null) {
            System.err.println("Could not find this customer with this specific ID! Try again.");
        }
        return customer;

    }


}
