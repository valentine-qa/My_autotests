package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//СМОТЕРТЬ ВМЕСТЕ С RegistrationPage.java, CalendarComponent.java, RegistrationResultModal

public class RegistrationFormAutotestWithPageObjects {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.google.com";
    }

    @Test
    void TestQaFormAutotest() {
        String userName = "Valentine";
        String lastName = "Borodich";
        String userEmail = "valentine-qa@gmail.com";
        String userGender = "Male";
        String phoneNumber = "375447721735";
        String subjectName = "Math";
        String hobby = "Sports";
        String imgPath = "Img/1.png";
        String currentAddress = "Belarus, Minsk";
        String state = "NCR";
        String city = "Delhi";

        new RegistrationPage().openPage();
        new RegistrationPage().setFirstName(userName);
        new RegistrationPage().setLastName(lastName);
        new RegistrationPage().setEmail(userEmail);
        new RegistrationPage().setGender(userGender);
        new RegistrationPage().setNumber(phoneNumber);
        new RegistrationPage().setBirthDate("13", "May", "2000");
        new RegistrationPage().setSubject(subjectName);
        new RegistrationPage().setHobby(hobby);
        new RegistrationPage().uploadPicture(imgPath);
        new RegistrationPage().setCurrentAdress(currentAddress);
        new RegistrationPage().selectState(state);
        new RegistrationPage().selectCity(city);
        new RegistrationPage().pressSubmit();

        new  RegistrationPage().verifyModalAppears();
        new  RegistrationPage().verifyModalResult("Student Name", userName);
        new  RegistrationPage().verifyModalResult("Student Email", userEmail);
        new  RegistrationPage().verifyModalResult("Mobile", phoneNumber);
    }
}

