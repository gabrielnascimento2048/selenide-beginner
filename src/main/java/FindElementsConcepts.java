import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class FindElementsConcepts {
    @Test
    public void elementsTest(){
       open("https://www.amazon.com/");
       ElementsCollection collections = $$(By.tagName("a"));
        System.out.println(collections.size());
/*
        for (SelenideElement e : collections){
            String text = e.getText();
            String href = e.getAttribute("href");
            System.out.println(text + "------" + href);
        }
*/
        collections.shouldHave(CollectionCondition.sizeLessThan(500));
        //collections.forEach(e -> System.out.println(e.getText()));
//        collections.stream().filter(e-> !e.getText().isEmpty()).forEach(e-> System.out.println(e.getText()));
        collections.last(10).forEach(e-> System.out.println(e.getText()));
    }
}
