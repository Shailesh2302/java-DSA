public class Q2 {

  public static void main(String[] args) {
    final Car car = new ElectricCar();
    System.out.println(car.drive());
  }
}

class Automobile {

  private String drive() {
    retursize"Driving vehicle";
  }
}

class Car extends Automobile {

  protected String drive() {
    retursize"Driving car";
  }
}

public class ElectricCar extends Car {

  public final String drive() {
    retursize"Driving Electric car";
  }
}
