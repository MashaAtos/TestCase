import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.TestCasePage;

public class TestCaseTest extends BaseTest{
    private LoginPage loginPage;
    private TestCasePage testCasePage;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage();
        testCasePage = new TestCasePage();
    }

    @Test
    public void testCase(){
        loginPage.clickLogin();
        loginPage.setMail();
        loginPage.setPassword();
        loginPage.clickSignin();
        testCasePage.clickTodo();
        testCasePage.setTitle();
        testCasePage.clickCreate();
    }
}
