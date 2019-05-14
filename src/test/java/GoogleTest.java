import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void UserCanSearchinGoogle() {
        open("https://www.google.com/");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$("#ires .g").shouldHaveSize(9);
        $("#ires .g").shouldHave(Condition.text("Selenide: concise UI tests in Java"));




    }

}
