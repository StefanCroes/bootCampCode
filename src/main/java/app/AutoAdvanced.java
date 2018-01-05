package app;

public class AutoAdvanced {

    private String brand;

    public AutoAdvanced(String brand) {
        this.brand = brand;
      }

      public void printBrand() {
        System.out.println("Car brand: " + brand);
      }

      public double calculateTorque(int force, int rpm) {
          double torque = (force * 5252)/rpm;
          return torque;

      }
}
