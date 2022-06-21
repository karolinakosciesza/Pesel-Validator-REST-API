import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class TestValidPesel_LeapYears {
    @Test
    public void testGetResponse_ValidPeselForLapYear1804() {
        String expectedBody = "{\"pesel\":\"04822907507\",\"isValid\":true,\"dateOfBirth\":\"1804-02-29T00:00:00\",\"gender\":\"Female\",\"errors\":[]}";

        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=04822907507");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetResponse_ValidPeselForLapYear1996() {
        String expectedBody = "{\"pesel\":\"96022904208\",\"isValid\":true,\"dateOfBirth\":\"1996-02-29T00:00:00\",\"gender\":\"Female\",\"errors\":[]}";

        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=96022904208");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetResponse_ValidPeselForLapYear2000() {
        String expectedBody = "{\"pesel\":\"00222919261\",\"isValid\":true,\"dateOfBirth\":\"2000-02-29T00:00:00\",\"gender\":\"Female\",\"errors\":[]}";

        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00222919261");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);


    }
}
