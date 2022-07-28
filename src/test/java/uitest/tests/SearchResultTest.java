package uitest.tests;

import org.junit.Assert;
import org.junit.Test;
import uitest.BaseTest;
import uitest.Pages.LandingPage;
import uitest.Pages.SearchResultsPage;

import static uitest.Pages.SearchResultsPage.getFirstProductName;

public class SearchResultTest extends BaseTest {
    private final static String BASE_URL = "http://automationpractice.com/";
    private final static String SEARCH_QUERY = "CHIFFON";

    /**
     * Произведем тест поиска
     * Откроем базовый URL
     * Введем запрос, нажмем энтер
     * Получим название товара
     * Проверим, что в названии товара содержится слово из поискового запроса
     */
    @Test
    public void checkChiffon(){
        LandingPage landingpage = new LandingPage(BASE_URL);
        landingpage.search(SEARCH_QUERY);
        String name = getFirstProductName();
        Assert.assertTrue(name.contains("Chiffon"));
    }
}
