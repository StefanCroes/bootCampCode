package chapterSix;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class conditionExercises {

    @Test
    public void ageChecker() {

        int age = 21;
        if (age > 20 && age <65) {
            System.out.println("Deelnemer toegelaten");
        } else if (age < 21) {
            System.out.println("Deelnemer te jong");
        }
        else {
            System.out.println("Deelnemer niet toegelaten. Check de unit manager");
        }
    }

}
