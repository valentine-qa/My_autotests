import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MyExamples {

    @BeforeAll //(Преднастройки)
    public void config() {
        Configuration.browser = "chrome"; //(Выбор стандартного браузера)
        Configuration.browserSize = "1920x1080"; //(Выбор размера экрана браузера)
        Configuration.baseUrl = "https://www.google.com"; //(Выбор поисковика)
        Configuration.holdBrowserOpen = true; //(Браузер не закрывается после теста)
    }

    @Test //(Тестовые кейсы)
    public void myExample() {

        open("https://github.com/valentine-qa"); //(Открытие страницы)

        //ВАРИТАНЫ ПОИСКА
        $("#firstName"); //id
        $(".firstName"); //class
        $("a[href='/selenide/selenide/wiki/SoftAssertions']"); //тег а + href
        // обращение к родителю и поиск внутри него по тегу for
        $("#hobbiesWrapper").$("[for=hobbies-checkbox-1]");
        // Поиск родительского списка и выбор из него n-го элемента
        $("[data-test='panel slides']").$$("[data-test='item click-area']").get(0).click();

        //-----------------------------
                // <input type="email" class="inputtext login_form_input_box">
        // несколько классов
        $(".inputtext.login_form_input_box").setValue("1");
        //тег и несколько классов
        $("input.inputtext.login_form_input_box").setValue("1");

        //-----------------------
        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>

        $(".inputtext").$(".login_form_input_box").setValue("1");
        $(".inputtext .login_form_input_box").setValue("1");

        // Работа с селектором даты
        $("#dateOfBirthInput");
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--013");

        // Поиск по тексту
        $("#stateCity-wrapper").$(byText("NCR")); //класс и в нем текст
        $(byText("valentine-qa")).shouldBe(visible); //текст по всей странице
    }


        //Перемещение элементов (А вместо В)
        void moveAtoB() {
            open("https://the-internet.herokuapp.com/drag_and_drop");
            SelenideElement columnA = $("#column-a");
            SelenideElement columnB = $("#column-b");
            actions().clickAndHold(columnA).moveToElement(columnB).release().perform();
        }
}


