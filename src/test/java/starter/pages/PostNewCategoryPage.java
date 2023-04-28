package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostNewCategoryPage {
    public String endpoint = "https://altashop-api.fly.dev/api/categories";

    @Step ("I have endpoint post new user")
    public String setPostEndpoint(){
        return endpoint;
    }

    @Step ("I send post new user")
    public void sendPostHttpRequest(){
        String name = "Category Aulia";
        String description = "ini category aulia";

        String body = "{\n" +
                "    \"name\":" + name + ",\n" +
                "    \"description\":" + description + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpoint());
    }
}
