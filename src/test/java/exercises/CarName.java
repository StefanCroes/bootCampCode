package exercises;

import app.AutoAdvanced;
import org.testng.annotations.Test;

public class CarName {

        @Test
        public void checkCar() {
            Auto auto = new Auto();
            auto.printBrand("Volvo");
            auto.printDoors(5);
            auto.printMotorType("Diesel");
            auto.calculateTorque(350,1000);
        }

        @Test
        public void checkBetterCare() {
            AutoAdvanced autoAdvanced = new AutoAdvanced("Tesla");
            autoAdvanced.printBrand();
            double torquereturn = autoAdvanced.calculateTorque(250,1000);
        }



    }