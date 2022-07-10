import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void googleSearchTest() {
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
