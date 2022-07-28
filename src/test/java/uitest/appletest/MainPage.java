package uitest.appletest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница Appleinsider
 */

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка Enter
     * @param searchstring поисковая строка
     */
    public SearchPage search(String searchstring){
        textBoxInput.setValue(searchstring);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    };

}
