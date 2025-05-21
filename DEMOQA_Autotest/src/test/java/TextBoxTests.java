import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.google.com";
    }

    @Test
    void fullBoxTest() {
        // open https://demoqa.com/text-box
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Valentine Borodich");
        $("#userEmail").setValue("valentine-qa@gmail.com");
        $("#currentAddress").setValue("Belarus, Minsk");
        $("#permanentAddress").setValue("Belarus, Minsk");
        $("#submit").click();

        $("#output").shouldHave(text("Valentine Borodich"), text("valentine-qa@gmail.com"),
                text("Belarus, Minsk"), text("Belarus, Minsk"));



    }
}
