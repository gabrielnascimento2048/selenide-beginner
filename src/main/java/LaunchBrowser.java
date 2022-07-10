import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class LaunchBrowser {

    @Test
    public void launchBrowserTest() {
        //by default use google Chrome
//        Configuration.browser = "microsoft edge";
//        System.setProperty("selenide.browser","chrome");
        Configuration.headless = true; //by default headless is false
       // Configuration.startMaximized = true;
        //Configuration.baseUrl("https://google.com");
        Configuration.webdriverLogsEnabled = true;
        open("https://google.com");
        $(By.id("L2AGLb")).click();
        $(By.name("q")).setValue("Naveen AutomationLabs");
        $(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(appear);
        String header = ($(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']"))).getText();
        System.out.println(header);
        Assert.assertEquals(header, "Welcome to Naveen AutomationLabs - naveen automationlabs");
        int headerCount = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println(headerCount);
        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(9));
    }

}
