package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Простые демонстационные тесты")
public class SimpleTest {

    @Disabled("id баг-репорта в jira") //Аннотация для пометки минорного бага который пока не будет фикситься
    // Либо отключить тест который не работает (потом переделается), может быть и над классом
    @Test //Аннотация позволяет JUnit воспринимать код ниже как тест
    @DisplayName("Проверка корректности работы метода methodEx()") //Аннтоция для отчетов Allure, условно заголовок
    public void simpleTest() {
        String actual = methodEx();
        Assertions.assertEquals("1", actual);
    }


    String methodEx() {
        return "1";
    }
}
