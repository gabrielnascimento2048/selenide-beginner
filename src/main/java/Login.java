import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

    @Test
    public void userCanLoginByUsername() {
        open("https://www.google.com/");
        $(By.id("L2AGLb")).click();
        $(By.name("q")).setValue("youtube");
        $(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(appear);

        String link = $(By.xpath("//h3[text()='YouTube']")).getText();
        System.out.println(link);
        Assert.assertEquals(link,"YouTube");

        int linkHeader = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println(linkHeader);

        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(linkHeader));

        $(By.xpath("//h3[text()='YouTube']")).click();

        //      $("#submit").click();
       // $(".loading_progress").should(disappear); // Waits until element disappears
        //      $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }
}
