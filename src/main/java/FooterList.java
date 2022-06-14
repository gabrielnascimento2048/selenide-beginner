import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class FooterList {
    @Test
    public void elementsTest(){
        open("https://www.freshworks.com/");
        ElementsCollection collections = $$(By.xpath("//footer//ul/li/a"));
        System.out.println(collections.size()); // show how many items we have

        collections.forEach(e-> System.out.println(e.getText())); // retrieve all values with empty values
        collections.last(10).forEach(e-> System.out.println(e.getText())); // get the last 10 values
        List<String> footerTextList = collections.texts(); // retrieving all without empty values
        footerTextList.forEach(e-> {
            System.out.println(e); // interact a list getting all without empty values
        });
    }
}
