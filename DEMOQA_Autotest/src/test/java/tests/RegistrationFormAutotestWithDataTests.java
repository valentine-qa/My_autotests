package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static pages.TestBase.*;

//СМОТЕРТЬ ВМЕСТЕ С RegistrationPage.java и TestBase.java

public class RegistrationFormAutotestWithDataTests {
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.google.com";
    }

    @Test
    void TestQaFormAutotest() {

        registrationPage.openPage();
        registrationPage.setFirstName(userName);
        registrationPage.setLastName(lastName);
        registrationPage.setEmail(userEmail);
        registrationPage.setGender(userGender);
        registrationPage.setNumber(phoneNumber);
        registrationPage.setBirthDate("13", "May", "2000");
        registrationPage.setSubject(subjectName);
        registrationPage.setHobby(hobby);
        registrationPage.uploadPicture(imgPath);
        registrationPage.setCurrentAdress(currentAddress);
        registrationPage.selectState(state);
        registrationPage.selectCity(city);
        registrationPage.pressSubmit();

        registrationPage.verifyModalAppears();
        registrationPage.verifyModalResult("Student Name", userName);
        registrationPage.verifyModalResult("Student Email", userEmail);
        registrationPage.verifyModalResult("Mobile", phoneNumber);
    }
}

