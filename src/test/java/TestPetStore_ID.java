import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class TestPetStore_ID {
    @Test
    public void  testGetRequest_responseElements_PurchuaseOrderID() {
        Response actualResponse = get("https://petstore.swagger.io/v2/store/order/1");
        int actualId = actualResponse.path("code");

        Assert.assertEquals(actualId, 1);
    }

    @Test
    public void testGetRequest_respondeElements_PetID() {
        Response actualResponse = get ("https://petstore.swagger.io/v2/pet/1");
        String actualName = actualResponse.path("status");

        Assert.assertEquals(actualName,"available");
    }
}
