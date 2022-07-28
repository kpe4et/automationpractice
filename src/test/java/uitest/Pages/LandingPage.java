package uitest.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage {
    public LandingPage(String url){
        Selenide.open(url);
    }

    /**
     * опишем элементы страницы
     * баннер
     * меню (телефон, контакты, логин)
     * лого строка_поиска корзина
     * ссылки каталога (женщины / платья / футболки)
     * слайдер + 2 картинки
     * популярные + бестселлеры
     * 7 единиц продукта
     * 5 ссылок каталога
     * футер
     */
    public final SelenideElement banner = $(".banner");  // верхний баннер
    public final SelenideElement phone = $(".shop-phone"); // блок номер телефона в меню
    public final SelenideElement contactUs = $("#contact-link"); // ссылка на контакты
    public final SelenideElement searchBar = $("#search_query_top"); // строка поиска
    public final SelenideElement womenHeader = $("a[title=\"Women\"]"); // кнопка каталога Women
    public final SelenideElement previousButton = $(".bx-prev"); // кнопка слайдера назад
    public final SelenideElement nextButton = $(".bx-next"); // кнопка слайдера вперед

    public void getContacts(){
        contactUs.click();
    }

    public void clickWomen() {
        womenHeader.click();
    }

    public SearchResultsPage search(String query){
        searchBar.setValue(query).pressEnter();
        return new SearchResultsPage();
    }

    /*
    public LandingPage getCurrentSliderImageAlt(){
    }
    */
}