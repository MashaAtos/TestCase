package page;
import static setup.DriverSetup.getDriver;

public class TestCasePage extends BasePage {
    public TestCasePage() {
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl(){return BASE_URL;}

    public void clickTodo(){
        find("li:nth-child(4) > a").click();
    }

    public void setTitle(){
        find("#title").sendKeys("Hello WorkFront");
    }

    public void clickCreate(){
        find("#createTodoForm .btn-primary").click();
    }
}

