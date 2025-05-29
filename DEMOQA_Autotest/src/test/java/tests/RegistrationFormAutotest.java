package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormAutotest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.google.com";
    }

    @Test
    void TestQaFormAutotest() {

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Valentine");
        $("#lastName").setValue("Borodich");
        $("#userEmail").setValue("valentine-qa@gmail.com");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("375447721735");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--013").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$("[for=hobbies-checkbox-1]").click();
        $("#uploadPicture").uploadFromClasspath("Img/1.png");
        $("#currentAddress").setValue("Belarus, Minsk");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    }
}

