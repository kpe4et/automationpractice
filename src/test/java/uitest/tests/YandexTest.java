package uitest.tests;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    public void tryTheYandexSearch() {
        open("https://yandex.ru");
    }
}
