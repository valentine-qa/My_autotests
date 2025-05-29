package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

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
        Faker faker = new Faker();
        String userName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                userEmail = faker.internet().emailAddress(),
                currentAddress = faker.address().fullAddress();



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

