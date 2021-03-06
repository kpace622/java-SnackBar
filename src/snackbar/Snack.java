package snackbar;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public int getQuantity() {
      return quantity;
    }

    public double getCost() {
      return cost;
    }

    public int getVendinMachineId() {
      return vendingMachineId;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setCost(double cost) {
      this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId) {
      this.vendingMachineId = vendingMachineId;
    }

    public void addQuantity(int num) {
      this.quantity = this.quantity + num;
    }
  
    public void buySnacks(int num) {
      this.quantity = this.quantity - num;
    }
}
