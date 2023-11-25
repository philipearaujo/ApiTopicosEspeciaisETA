import io.restassured.response.Response;
import org.testng.annotations.Test;
import queries.LanguageQuery;
import static org.hamcrest.Matchers.*;


public class LanguageTest extends BaseTest{

    @Test
    public void shouldReturnStatus200(){

        Response response = LanguageQuery.getLanguageQuery(requestSpec);

                response.then().assertThat().statusCode(200).log().body();
    }
    @Test
    public void validateReturnName(){
        Response response = LanguageQuery.getLanguageQuery(requestSpec);

        response.then().assertThat().body("data.language.name", is ("Bosnian"));
    }
    @Test
    public void validateReturnCode(){
        Response response = LanguageQuery.getLanguageQuery(requestSpec);

        response.then().assertThat().body("data.language.code", is ("bs"));
    }
    @Test
    public void validateReturnNative(){
        Response response = LanguageQuery.getLanguageQuery(requestSpec);

        response.then().assertThat().body("data.language.native", is ("Bosanski"));
    }
}
