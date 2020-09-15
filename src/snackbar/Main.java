package snackbar;

import snackbar.Customer;
import snackbar.VendingMachine;

public class Main {
  private static void workWithData() {
    System.out.println("Project is working!");

    //Instanciating snacks
    Snack s1 = new Snack("Chips", 36, 1.75, 1);
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
    Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
    Snack s4 = new Snack("Soda", 24, 2.50, 2);
    Snack s5 = new Snack("Water", 20, 2.75, 2);

    //Instanciating vending machines
    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    //Instanciating vending machines
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    // process 1
    c1.buySnacks(s4.getCost() * 3);
    s4.buySnacks(3);
    System.out.println("Customer 1 cash on hand " + c1.getCash());
    System.out.println("Quantity of snack 4 is " + s4.getQuantity());
    System.out.println();
    
    // process 2
    c1.buySnacks(s3.getCost());
    s3.buySnacks(1);
    System.out.println("Customer 1 cash on hand " + c1.getCash());
    System.out.println("Quantity of snack 3 is " + s3.getQuantity());
    System.out.println();

    // process 3
    c2.buySnacks(s4.getCost() * 2);
    s4.buySnacks(2);
    System.out.println("Customer 2 cash on hand " + c2.getCash());
    System.out.println("Quantity of snack 4 is " + s4.getQuantity());
    System.out.println();

    // process 4
    c1.addCash(10.00);
    System.out.println("Customer 1 cash on hand " + c1.getCash());
    System.out.println();

    // process 5
    c1.buySnacks(s2.getCost());
    s2.buySnacks(1);
    System.out.println("Customer 1 cash on hand " + c1.getCash());
    System.out.println("Quantity of snack 2 is " + s2.getQuantity());
    System.out.println();
    
    // process 6
    s3.addQuantity(12);
    System.out.println("Quantity of snack 3 is " + s3.getQuantity());
    System.out.println();

    // process 7
    c2.buySnacks(s3.getCost() * 3);
    s3.buySnacks(3);
    System.out.println("Customer 2 cash on hand " + c2.getCash());
    System.out.print("Quantity of snack 4 is " + s3.getQuantity());
  }
    public static void main(String[] args) {
      workWithData();
  }
}