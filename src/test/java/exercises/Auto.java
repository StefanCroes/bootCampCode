package exercises;

public class Auto {

    public void printBrand(String brand) {

        System.out.println("Brand name is: " + brand);
    }

    public void printDoors(int doors) {

        System.out.println("Number of doors is " + doors );
    }

    public void printMotorType(String MotorType) {

        System.out.println("Motor Type is " + MotorType);
    }

    public void calculateTorque(int force, int rpm) {
            double torque = (force * 5252)/rpm;
            System.out.println("Torque is " + torque);
    }
}
