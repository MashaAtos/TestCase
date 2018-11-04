package page;

import org.openqa.selenium.By;

import static setup.DriverSetup.getDriver;

public class LoginPage extends BasePage {

    private By loginButton = By.cssSelector(".nav li:nth-child(2) > a");
    private By email = By.id("email");
    private By password = By.id("password");
    private By signin = By.cssSelector("#loginForm .btn");

 public LoginPage() {
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl(){return BASE_URL;}

    public void clickLogin() {
        find(loginButton).click();
    }

    public void setMail(){
        find(email).sendKeys("mariam.a.sargsyan@gmail.com");
    }

    public void setPassword(){
        find(password).sendKeys("123456");
    }

    public void clickSignin() {
        find(signin).click();
    }

}