package uitest.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    /**
     * опишем элементы страницы
     * баннер
     * меню (телефон, контакты, логин)
     * лого строка_поиска корзина
     * ссылки каталога (женщины / платья / футболки)
     * breadcrumbs
     * бестселлеры слева
     * блок резултатов справа (и там куча элементов)
     * футер
     */

    public final static ElementsCollection searchResults = $$(".product-content h5 a");
    public static String getFirstProductName(){ return searchResults.first().getOwnText(); }

}
