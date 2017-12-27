package exercises;

import org.testng.annotations.Test;

public class AboutMethods {

    @Test
    private void printProduct() {
        System.out.println(multiply(5,8));
    }

    private int multiply(int a, int b) {
        return a * b;

    }
}
