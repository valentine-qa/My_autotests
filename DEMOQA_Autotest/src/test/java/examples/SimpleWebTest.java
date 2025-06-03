package examples;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.*;

public class SimpleWebTest {
    @BeforeAll
    static void preconditions(){
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    void setup(){
        open("https://yandex.by/");
    }
    @ValueSource(strings = {
            "Selenide",
            "Allure"
    })  //Аннотация описывает тип данных которые будут передаваться в тест, сколько в нем данных столько и будет тестов
    @ParameterizedTest(name = "В поисковой выдаче яндекса должно отображаться 10 результатов по запросу {0}") // Аннотация отражает что тест будет параметризированным
    @Tag("BLOCKER") // Тэгает чтобы в дальнейшем можно было запустить тест с опр тегом

    void searchResultsShouldBeGreaterThan10(String testData){
        $(".simple-popup__close").click();
        $(".search3__input").setValue(testData).pressEnter();
        $$("li.serp-item").shouldHave(sizeGreaterThanOrEqual(10));
    }


//    @Test //Аннотация говорит Junit что снизу будет тест
//    @DisplayName("Проверка числа результатов в поиске яндекса")
//    void photoSearchTest(){
//        open("https://yandex.by/");
//        $("#image-search").click();
//        // etc
//    }
}
