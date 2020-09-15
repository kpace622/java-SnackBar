package snackbar;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  //getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCash() {
    return cash;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public void addCash(double num) {
    this.cash = this.cash + num;
  }

  public void buySnacks(double num) {
    this.cash = this.cash - num;
  }

  @Override
  public String toString() {
    return name + " has " + cash + " cash.";
  }
}
