import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testcase1 extends TestBase{
    @Test
    @Parameters("browser")
    public void test(String n)
    {
     System.out.println(n);
    }
    @Test(groups = "sanity")
    public void check()
    {
        System.out.println("kool");
    }
}
