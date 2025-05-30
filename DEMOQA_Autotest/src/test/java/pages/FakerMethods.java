package pages;

import com.github.javafaker.Faker;
import utils.RandomUtils;

import static utils.RandomUtils.getRandomInt;
import static utils.RandomUtils.getRandomItemFromArray;

public class FakerMethods {
    static String[] genders = {"Male", "Female", "Other"};
    static String[] hobby = {"Sports", "Reading", "Music"};
    static String[] subjects = {"Maths", "Chemistry", "Commerce", "Economics", "Computer Science"};

    public static String fakerUserName() {
        return new Faker().name().firstName();
    }

    public  static String fakerLastName() {
        return new Faker().name().lastName();
    }

    public static String fakerUserEmail() {
        return new Faker().internet().emailAddress();
    }

    public static String fakerCurrentAddress() {
        return new Faker().address().fullAddress();
    }


    public static String randomUserGender() {
        return getRandomItemFromArray(genders);
    }

    public static Integer fakerUserNumber() {
        return (int) new Faker().number().numberBetween(1000000000L, 9999999999L);
    }

    public static String randomUserHobby() {
        return getRandomItemFromArray(hobby);
    }

    public static String randomSubject() {
        return getRandomItemFromArray(subjects);
    }

}
