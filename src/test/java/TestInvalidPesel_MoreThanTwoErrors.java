import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class TestInvalidPesel_MoreThanTwoErrors {
    @Test
    public void testGetRequest_InvalidPesel_3Errors() {
        String expectedBody = "{\"pesel\":\"97130004444\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVY\",\"errorMessage\":\"Invalid year.\"},{\"errorCode\":\"INVM\",\"errorMessage\":\"Invalid month.\"},{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=97130004444");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetRequest_InvalidPesel_4Errors() {
        String expectedBody = "{\"pesel\":\"97130004442\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVC\",\"errorMessage\":\"Check sum is invalid. Check last digit.\"},{\"errorCode\":\"INVY\",\"errorMessage\":\"Invalid year.\"},{\"errorCode\":\"INVM\",\"errorMessage\":\"Invalid month.\"},{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=97130004442");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }
}
