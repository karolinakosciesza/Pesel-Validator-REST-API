import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class TestInvalidPesel_InvalidDay {
    @Test
    public void testGetRequest_InvalidPesel_InvalidDayInJanuaryXIX() {
        String expectedBody = "{\"pesel\":\"81813203442\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=81813203442");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInFebruaryXIX() {
        String expectedBody = "{\"pesel\":\"81822903443\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=81822903443");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInMarchXIX() {
        String expectedBody = "{\"pesel\":\"81833203444\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=81833203444");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInAprilXIX() {
        String expectedBody = "{\"pesel\":\"81843103448\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Female\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=81843103448");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInMayXX() {
        String expectedBody = "{\"pesel\":\"99053205555\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99053205555");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInJuneXX() {
        String expectedBody = "{\"pesel\":\"99063105559\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99063105559");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInJulyXX() {
        String expectedBody = "{\"pesel\":\"99073205557\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99073205557");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInAugustXX() {
        String expectedBody = "{\"pesel\":\"99083205558\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=99083205558");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInSeptemberXXI() {
        String expectedBody = "{\"pesel\":\"00293120555\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00293120555");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInOctoberXXI() {
        String expectedBody = "{\"pesel\":\"00303220556\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00303220556");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInNovemberXXI() {
        String expectedBody = "{\"pesel\":\"00313120550\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00313120550");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }

    @Test
    public void testGetResponse_InvalidPesel_InvalidDayInDecemberXXI() {
        String expectedBody = "{\"pesel\":\"00323220558\",\"isValid\":false,\"dateOfBirth\":null,\"gender\":\"Male\",\"errors\":[{\"errorCode\":\"INVD\",\"errorMessage\":\"Invalid day.\"}]}";
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Pesel?pesel=00323220558");
        String actualBody = response.getBody().asString();

        Assert.assertEquals(actualBody, expectedBody);
    }
}
