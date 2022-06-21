import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class TestInvalidPesel_InvalidMonthAndYear {
    @Test
    public void testGetRequest_InvalidMonthAndYear(){
        String expectedBody = "{\"pesel\":\"97130104441\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVY\",\"errorMessage\":\"Invalid year.\"},{\"errorCode\":\"INVM\",\"errorMessage\":\"Invalid month.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=97130104441");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }
}
