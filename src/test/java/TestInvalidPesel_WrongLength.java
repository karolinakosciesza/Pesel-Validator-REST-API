import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class TestInvalidPesel_WrongLength {
    @Test
    public void testGetRequest_TooLongPesel() {
        String expectedBody = "{\"pesel\":\"962229013311\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"INVL\",\"errorMessage\":\"Invalid length. Pesel should have exactly 11 digits.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=962229013311");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetRequest_TooShortPesel() {
        String expectedBody = "{\"pesel\":\"9622290133\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"INVL\",\"errorMessage\":\"Invalid length. Pesel should have exactly 11 digits.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=9622290133");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

}

