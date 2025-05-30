package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


//СМОТЕРТЬ ВМЕСТЕ С DemoQaFormAutotestWithPageObjects.java

public class RegistrationPage {
    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement firstNameInput = $("#firstName"), lastNameInput = $("#lastName"), EmailInput = $("#userEmail");

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
    }

    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void setLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void setEmail(String value) {
        EmailInput.setValue(value);
    }

    public void setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
    }

    public void setNumber(String value) {
        $("#userNumber").setValue(value);
    }

    public void setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        new CalendarComponent().setDate(day, month, year);
    }

    public void setSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
    }

    public void setHobby(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
    }

    public void uploadPicture(String path) {
        $("#uploadPicture").uploadFromClasspath(path);
    }

    public void setCurrentAdress(String value) {
        $("#currentAddress").setValue(value);
    }

    public void selectState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();
    }

    public void selectCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();

    }

    public void verifyModalAppears() {
        new RegistrationResultModal();
    }

    public void verifyModalResult(String key, String value) {
        new RegistrationResultModal();
    }

    public void pressSubmit() {
        $("#submit").click();
    }
}
