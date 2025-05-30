package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.FakerMethods;
import pages.RegistrationPage;

import static pages.FakerMethods.*;
import static pages.TestBase.*;
import static utils.RandomUtils.getRandomEmail;
import static utils.RandomUtils.getRandomString;

//Для использования JAVA FAKER добавить 'com.github.javafaker:javafaker:1.0.2' в сборку Gradle
//СМОТЕРТЬ ВМЕСТЕ С RegistrationPage.java и TestBase.java

public class RegistrationFormAutotestWithJavaFaker {
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

        registrationPage.setFirstName(fakerUserName());
        registrationPage.setLastName(fakerLastName());
        registrationPage.setEmail(fakerUserEmail());
        registrationPage.setGender(randomUserGender());
        registrationPage.setNumber(fakerUserNumber().toString());
        registrationPage.setBirthDate("13", "May", "2000");
        registrationPage.setSubject(randomSubject());
        registrationPage.setHobby(randomUserHobby());
        registrationPage.uploadPicture(imgPath);
        registrationPage.setCurrentAdress(fakerCurrentAddress());
        registrationPage.selectState(state);
        registrationPage.selectCity(city);
        registrationPage.pressSubmit();

        registrationPage.verifyModalAppears();
        registrationPage.verifyModalResult("Student Name", fakerUserName());
        registrationPage.verifyModalResult("Student Email", fakerLastName());
        registrationPage.verifyModalResult("Mobile", fakerUserNumber().toString());
    }
}

