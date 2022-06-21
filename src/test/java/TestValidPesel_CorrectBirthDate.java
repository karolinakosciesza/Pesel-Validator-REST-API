import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class TestValidPesel_CorrectBirthDate {
    @Test
    public void testGetResponse_ResponseElement_ShouldReturnBrithDate() {
        Response actualResponse = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=96222901874\n");
        String  actualBirthDate = actualResponse.path("dateOfBirth");

        Assert.assertEquals(actualBirthDate,"2096-02-29T00:00:00");
    }
}
