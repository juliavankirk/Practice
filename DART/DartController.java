package DART;

import DART.miscellaneous.Utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

import DART.models.*;

public class DartController {


    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static ArrayList<Game> games = new ArrayList<Game>();
    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public DartController() {

    }

    public void main() {

            System.out.println("Initializing DART . . .\n");
    }

    public static int intInput(String message) {
        System.out.println(message);
        return Utilities.intInput();
    }
    public static double doubleInput(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        return value;
    }

    public static String stringInput(String message) {

        System.out.println(message);
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        return value;
    }

    public static void renderSuccess(String message) {
        System.out.println(message);
    }
    public static void renderExit(String message) {
        System.out.println("Returning to previous menu.");
    }
    public static void renderError() {
        System.out.println("Invalid entry, please try again.");
    }

    public UUID readUUID() {
        String input = Utilities.stringInput();
        UUID retVal = null; //initialize as null otherwise compiler doesn't know what to do with it/ have to give it
        //initial value
        try {
            retVal = UUID.fromString(input); //converts UUID from a string
            return retVal;
        } catch (IllegalArgumentException e) {
            return retVal;
        }
    }

    public static void mainMenu(){
        System.out.println( "Main Menu:\n" +
                "Welcome to DART, your good old game rental system. The competition has no steam to keep up!\n" +
                "\n" +
                "Please specify your role by entering one of the options given:\n" +
                "1. Enter “M” for Manager \n" + //Password = "admin1234"
                "2. Enter “E” for Employee \n" + //Password = "password123"
                "3. Enter “C” for Customer\n" +
                "4. Enter “X” to exit system \n");
    }

        public static void managerMenu(){
            System.out.println("Manager Screen - Type one of the options below:\n" +
                    "1. Add an employee\n" +
                    "2. View all employees\n" +
                    "3. Return to Main Menu\n");
        }
        public static void employeeMenu(){
            System.out.println("Employee Screen - Type one of the options below:\n" +
                    "1. Register a game\n" +
                    "2. Register a song\n" +
                    "3. Register a customer\n" +
                    "4. View all games\n" +
                    "5. View all songs\n" +
                    "6. View all customers\n" +
                    "7. Show total rent profit\n" +
                    "8. Return to Main Menu\n");
        }


    public static void customerMenu(){
        System.out.println("Customer Screen - Type one of the options below:\n" +
                "1. Rent a game\n" +
                "2. Return a game\n" +
                "3. Return to Main Menu\n");
    }

    public static void mainMethod(){

        mainMenu();
        String value = stringInput("");
        System.out.println("Here");

        while(!value.equals("X")){
            switch (value){
                case "M":{
                    managerMenu();
                    Manager manager = new Manager();
                    int option = intInput("");
                    switch(option){
                        case 1:{
                            String firstname = stringInput("Please enter the first name of the employee");
                            String lastname = stringInput("Please enter the last name of the employee");
                            int birthyear = intInput("Please enter the birthyear of the employee");
                            String address1 = stringInput("Please enter the address 1 of the employee");
                            String address2 = stringInput("Please enter the address 2 of the employee");
                            double salary = doubleInput("Please enter the salary");

                            Employee e = new Employee(firstname,lastname,birthyear,address1,address2,salary);
                            manager.addEmployee(e,employees);
                            renderSuccess("Employee successfully added");
                        }
                        case 2:{
                            String uuid = stringInput("Please enter the ID of the employee you wat to remove");
                            manager.removeEmployee(uuid,employees);
                        }
                        case 3:{
                            manager.printAllEmployees(employees);
                        }
                    }
                }
                case "E":{
                    employeeMenu();
                    int option=intInput("");
                    switch(option){
                        case 1:{

                        }
                        case 2:{

                        }
                        case 3:{

                        }
                        case 4:{

                        }
                        case 5:{

                        }
                        case 6:{

                        }
                        case 7:{

                        }
                    }
                }
                case "C":{
                customerMenu();
                int option = intInput("");
                switch (option){
                    case 1:{

                    }
                    case 2:{

                    }
                    case 3:{

                    }
                }
                }
            }
        }
    }

    public static void main(String[] args) {
        mainMethod();
    }
}
