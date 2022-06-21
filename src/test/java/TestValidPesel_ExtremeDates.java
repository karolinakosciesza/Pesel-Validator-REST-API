import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class TestValidPesel_ExtremeDates {
    @Test
    public void testGetRequest_ValidPeselForYear1800() {
        String expectedBody = "{\"pesel\":\"00810117873\",\"isValid\":true,\"dateOfBirth\":\"1800-01-01T00:00:00\",\"gender\":\"Male\",\"errors\":[]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00810117873");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetRequest_ValidPeselForYear1899() {
        String expectedBody = "{\"pesel\":\"99923105774\",\"isValid\":true,\"dateOfBirth\":\"1899-12-31T00:00:00\",\"gender\":\"Male\",\"errors\":[]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99923105774");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetRequest_ValidPeselForYear1900() {
        String expectedBody = "{\"pesel\":\"00010104620\",\"isValid\":true,\"dateOfBirth\":\"1900-01-01T00:00:00\",\"gender\":\"Female\",\"errors\":[]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00010104620");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetRequest_ValidPeselForYear1999() {
        String expectedBody = "{\"pesel\":\"99123102678\",\"isValid\":true,\"dateOfBirth\":\"1999-12-31T00:00:00\",\"gender\":\"Male\",\"errors\":[]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99123102678");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetRequest_ValidPeselForYear2000() {
        String expectedBody = "{\"pesel\":\"00210101111\",\"isValid\":true,\"dateOfBirth\":\"2000-01-01T00:00:00\",\"gender\":\"Male\",\"errors\":[]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00210101111");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);
    }

    @Test
    public void testGetRequest_ValidPeselForYear2099() {
        String expectedBody = "{\"pesel\":\"99323111317\",\"isValid\":true,\"dateOfBirth\":\"2099-12-31T00:00:00\",\"gender\":\"Male\",\"errors\":[]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99323111317");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody,expectedBody);

    }
}
