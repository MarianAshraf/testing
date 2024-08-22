package Steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.Base;
import java.io.IOException;


public class Hooks extends Base {

    @Before
    public void start () throws IOException {
        LunchBrowser();
    }

    @After
    public void quit()
    {
        driver.quit();
    }
}

