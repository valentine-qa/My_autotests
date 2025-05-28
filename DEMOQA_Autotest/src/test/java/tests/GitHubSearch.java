package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class GitHubSearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

//    @Test
//    public void test() {
//        open("https://github.com/selenide/selenide");
//        $("[data-content=Wiki]").click();
//        $("a[href='/selenide/selenide/wiki/SoftAssertions']").click();
//        $(byText("3. Using JUnit5 extend test class:")).shouldBe(visible);
    }

