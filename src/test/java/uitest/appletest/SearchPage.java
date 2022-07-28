package uitest.appletest;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final static ElementsCollection articleTitles = $$x("//h2/a");

    /**
     * Возвращает href первой статьи
     * @return
     */
    public static String getHrefFromFitstArticle(){
        return articleTitles.first().getAttribute("href");
    }
}
