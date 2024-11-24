import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        findExceptionPageElements(driver);
        driver.quit();
    }

    private static void findExceptionPageElements(WebDriver driver){
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement linkTextLocator = driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("beginners program"));

        WebElement inputFieldTagName = driver.findElement(By.tagName("input"));
        WebElement inputFieldClassName = driver.findElement(By.className("input-field"));
        WebElement inputFieldXpath = driver.findElement(By.xpath("//input[@class='input-field']"));
        WebElement inputFieldCssSelector = driver.findElement(By.cssSelector("#row1 > input"));

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        WebElement editButtonId = driver.findElement(By.id("edit_btn"));
        WebElement editButtonName = driver.findElement(By.name("Edit"));
        WebElement editButtonCss = driver.findElement(By.cssSelector("#edit_btn"));
        WebElement editButtonXpath = driver.findElement(By.xpath("//button[@id='edit_btn']"));

        WebElement addButtonId = driver.findElement(By.id("add_btn"));
        WebElement addButtonName = driver.findElement(By.name("Add"));
        WebElement addButtonCss = driver.findElement(By.cssSelector("#add_btn"));
        WebElement addButtonXpath = driver.findElement(By.xpath("//button[@id='add_btn']"));

    }

    private static void findLoginPageElements(WebDriver driver){

        driver.get("https://practicetestautomation.com/practice-test-login/");
        // WebElement Locators will be added here
        WebElement usernameInputField = driver.findElement(By.id("username"));
        WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement usernameInputFieldCss = driver.findElement(By.cssSelector("input[id='username']"));

        WebElement passwordInputField = driver.findElement(By.name("password"));
        WebElement passwordInputFieldXpath = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement passwordInputFieldCss = driver.findElement(By.cssSelector("input[name='password']"));


        WebElement submitButton = driver.findElement(By.className("btn"));
        WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@id='submit']"));
        WebElement submitButtonCss = driver.findElement(By.cssSelector("button[id='submit']"));

        List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Test Automation"));

        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Test Automation")));

        WebElement homeButton = driver.findElement(By.className("menu-item-home"));
    }

    private static String chromeTest(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }
}
