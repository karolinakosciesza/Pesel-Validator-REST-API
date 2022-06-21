import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class TestValidPesel_Gender {
    @Test
    public void testGetResponse_ResponseElement_ShouldReturnFamale() {
        Response actualResponse = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00210116768");
        String actualGender = actualResponse.path("gender");

        Assert.assertEquals(actualGender,"Female");
    }

    @Test
    public void testGetResponse_ResponseElement_ShouldReturnMale() {
        Response actualResponse = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00210104176");
        String actualGender = actualResponse.path("gender");

        Assert.assertEquals(actualGender,"Male");
    }
}
