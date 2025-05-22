import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaFormAutotestWithComments {

    @BeforeAll
    static void beforeAll() {
//        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.google.com";
    }

    @Test
    void TestQaFormAutotest() {

        // open https://demoqa.com/automation-practice-form
        open("https://demoqa.com/automation-practice-form");

        //Find and fill field "Name"
        $("#firstName").setValue("Valentine");

        //Find and fill field "Last Name"
        $("#lastName").setValue("Borodich");

        //Find and fill field "Email Name"
        $("#userEmail").setValue("valentine-qa@gmail.com");

        //Find and click radiobutton "Gender"
//        $("#gender-radio-1").click();   WRONG method
//        $(byText("Female")).click(); Method By Text (Not Good (Germany location?))
//        $("label[for=gender-radio-1]").click(); good
//        $("#genterWrapper").$(byText("Female")).click(); Parent class + text BEST
        $("#gender-radio-1").parent().click();

        //Find and fill field "Mobile"
        $("#userNumber").setValue("375447721735");

        //Find and click field "Date of Birth"
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
//        $(".react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--013").click();
        //Если в окне одно число может принадлежать предыд или след месяцу, то
//        $(".react-datepicker__day--02:not(react-datepicker__day--outside-month)").click();

        //Find and fill field "Subject"
        $("#subjectsInput").setValue("Math").pressEnter();

        //Find and click radiobutton "Hobbies"
        //$("#hobbies-checkbox-1").click();     WRONG method
//        $("#hobbies-checkbox-1").parent().click();
//        $(byText("Reading")).click();     Method By Text
        $("#hobbiesWrapper").$("[for=hobbies-checkbox-1]").click();

        //Choose and upload file
//        $("#uploadPicture").uploadFile(new File("src/test/resources/Img/1.png"));
        $("#uploadPicture").uploadFromClasspath("img/1.png");

        //Find and fill field "Current Address"
        $("#currentAddress").setValue("Belarus, Minsk");

        //Find and choose "State and City"
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();

        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        //Press button "Submit"
        $("#submit").click();

        //Checkout
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
//        $(".table-responsive").shouldHave(text("Thanks for submitting the form"),
//                text("Valentine"), text("Borodich"), text("valentine-qa@gmail.com"), text("375447721735"));
    }
}

