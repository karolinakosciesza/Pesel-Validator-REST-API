import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class TestInvalidPesel_InvalidCheckSum {
    @Test
    public void testGetRequest_InvalidCheckSum() {
        String expectedBody = "{\"pesel\":\"96022904209\",\"isValid\":false,\"dateOfBirth\":\"1996-02-29T00:00:00\",\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVC\",\"errorMessage\":\"Check sum is invalid. Check last digit.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=96022904209");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }
}
