package snackbar;

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
  }
    public static void main(String[] args) {
      workWithData();
  }
}