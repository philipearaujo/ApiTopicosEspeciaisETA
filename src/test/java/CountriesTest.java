import io.restassured.response.Response;
import org.testng.annotations.Test;
import queries.CountriesQuery;


public class CountriesTest extends BaseTest {

    @Test
    public void shouldReturnStatus200(){

        Response response = CountriesQuery.getCountryQuery(requestSpec);

        response.then().assertThat().statusCode(200);
    }
}
