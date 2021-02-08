import org.junit.Test;
import play.mvc.Http;
import play.mvc.Result;
import play.test.Helpers;
import play.test.WithApplication;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.contentAsString;
public class RoutesTestFunctional extends WithApplication {
    @Test
    public void testCreate() {
        HashMap<String,String> Map = new HashMap<>();
        Map.put("category_name","江苏菜");
        Http.RequestBuilder req = Helpers.fakeRequest()
                .method("POST")
                .uri("/api/1.0/categories")
                .bodyForm(Map);
        Result r = Helpers.route(app, req);
        System.out.println(contentAsString(r));
        assertEquals(200, r.status());
    }
    @Test
    public void testDelete() {
        Http.RequestBuilder req = Helpers.fakeRequest()
                .method("DELETE")
                .uri("/api/1.0/categories/江苏菜");
        Result r = Helpers.route(app, req);
        System.out.println(contentAsString(r));
        assertEquals(200, r.status());
    }
    @Test
    public void testShowAll() {
        Http.RequestBuilder req = Helpers.fakeRequest()
                .method("GET")
                .uri("/api/1.0/categories")
                .header("Accept", "application/json");
        Result r = Helpers.route(app, req);
        System.out.println(contentAsString(r));
        assertEquals(200, r.status());
    }
}