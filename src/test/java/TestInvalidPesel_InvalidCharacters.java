import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class TestInvalidPesel_InvalidCharacters {
    @Test
    public void testGetRequest_InvalidPeselWithCharAtTheBeggining() {
        String expectedBody = "{\"pesel\":\".962229013311\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"NBRQ\",\"errorMessage\":\"Invalid characters. Pesel should be a number.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=.962229013311");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetRequest_InvalidPeselWithCharInTheMiddle() {
        String expectedBody = "{\"pesel\":\"9622290.13311\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"NBRQ\",\"errorMessage\":\"Invalid characters. Pesel should be a number.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=9622290.13311");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetRequest_InvalidPeselWithCharAtTheEnd() {
        String expectedBody = "{\"pesel\":\"962229013311.\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"NBRQ\",\"errorMessage\":\"Invalid characters. Pesel should be a number.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=962229013311.");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetRequest_InvalidPeselWithLetter() {
        String expectedBody = "{\"pesel\":\"962229013311a\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"NBRQ\",\"errorMessage\":\"Invalid characters. Pesel should be a number.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=962229013311a");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetRequest_InvalidPeselWithLetterAndChar() {
        String expectedBody = "{\"pesel\":\"962229013311a.\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":null,\"errors\":[{\"errorCode\":\"NBRQ\",\"errorMessage\":\"Invalid characters. Pesel should be a number.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=962229013311a.");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);

    }
}
