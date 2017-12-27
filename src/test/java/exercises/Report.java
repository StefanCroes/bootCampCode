package exercises;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

        @Test
    public void report() {
        Reporter.log("Hello world");
    }
}
