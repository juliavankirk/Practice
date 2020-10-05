package DART.models;

// identify all the classes you need, all the models, you need a CUSTOMER to store customers 
// what is a customer and an employee in the system

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class Employee {

    private UUID Id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String address1;
    private String address2;
    private double monthlySalary;

    public Employee(String firstName, String lastName, int birthYear, String address1, String address2,
                         double monthlySalary) {

        this.Id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address1 = address1;
        this.address2 = address2;
        this.monthlySalary = monthlySalary;
    }


    public UUID getId() {
        return Id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getAddress() {
        return address1 + "\r\n" + address2;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getAge() {
        return LocalDate.now().getYear() - getBirthYear();
    }

    public void addGame(){

    }
    public void removeGame(){

    }
    public void viewAllGames(){

    }
}
