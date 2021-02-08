import controllers.HomeController;
import org.junit.Test;
import play.mvc.Result;
import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.contentAsString;
public class HomeControllerTestUnit {
    @Test
    public void testSum() {
        int a = 1 + 1;
        assertEquals(2, a);
    }
    @Test
    public void testIndex() {
        HomeController hc = new HomeController();
        Result result = hc.index();
        assertEquals(OK, result.status());
        assertEquals("text/plain", result.contentType().get());
        assertEquals("utf-8", result.charset().get());
        assertEquals("MIMO-Receta-Api", contentAsString(result));
    }
}