import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    @Test
    void successfulLoginTest(){
        // Строка блокирует закрытие браузера после теста
        Configuration.holdBrowserOpen = true;

        // Открыть форму авторизации
        open("https://qa.guru/cms/system/login");

        // Ввод адреса эл почты
        $("[name=email]").setValue("valentine-qa@mail.ru");

        // Ввод пароля
        $("[name=password").setValue("valentine-qa");

        // Нажатие кнопки "Вход"
        $(".btn-success").click();

        // Нажатие на иконку пользователя в левом меню
        $(".menu-item-icon").click();

        // Нажатие вкладку "Пользователь"
        $(".subitem-link").click();

        // Наведение на галочку и поиск в ней заголовка "Эл. адрес подтвержден"
        $("span.fa.fa-chevron-circle-down")
                .shouldHave(attribute("title", "Эл. адрес подтвержден"));
    }
}