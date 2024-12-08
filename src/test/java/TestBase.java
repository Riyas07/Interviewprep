import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {
    @BeforeSuite(alwaysRun = true)
    @Parameters("browser")
    public void testBase(String browser)
    {
       // System.out.println(browser);
    }
}
