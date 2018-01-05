package apiTest;

import com.jayway.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static com.jayway.restassured.RestAssured.*;

public class ApiTest {

    @Test
    public void FormulaOneresults() {
        given().
                when().
                    get("http://ergast.com/api/f1/2016/drivers/max_verstappen/results.json").
                then().
                statusCode(200);
    }


@Test
public void TestVerstappen() {
    given().
            pathParam("driver", "max_verstappen").
            when().
            get("http://ergast.com/api/f1/2016/drivers/{driver}/results.json").
            then().
            assertThat().body("MRData.RaceTable.driverId", equalTo("max_verstappen"));
}

@Test
    public void pathParam(){
        given().pathParam("season", 2017).
                pathParam("result", "last").
                when().get("https://ergast.com/api/f1/{season}/{result}/results.json").
                then().statusCode(200).
                assertThat().body("MRData.RaceTable.season", equalTo("2017"));
}

@Test
public void multipleVariables(){

    int season = 2017;
    String result = "last";

    given().when().get("https://ergast.com/api/f1/{season}/{result}/results.json", season, result).
            then().statusCode(200).
            assertThat().body("MRData.RaceTable.season", equalTo("2017"));
}


}
