import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest{
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {

        loginPage = new LoginPage();
    }

    @Test
    public void LoginPage() {
        loginPage.clickLogin();
        loginPage.setMail();
        loginPage.setPassword();
        loginPage.clickSignin();
    }
}
