import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class NavigationConcepts {

    @Test
    public void navigationTest() {
        open("https://www.google.com");
        System.out.println(title());

        open("https://amazon.com");
        System.out.println(title());

        back();
        System.out.println(title());

        forward();
        System.out.println(title());

        back();
        System.out.println(title());

        sleep(5000); // doesn't work with Thread.sleep(5000)

        refresh();
    }
}
