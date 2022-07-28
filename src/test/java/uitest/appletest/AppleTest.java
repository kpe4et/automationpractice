package uitest.appletest;

import org.junit.Assert;
import org.junit.Test;
import uitest.BaseTest;

public class AppleTest extends BaseTest {
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "iPhone 12 или Samsung Galaxy S22";

    @Test
    public void checkHref() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFitstArticle()
                .contains("iphone-12"));
    }
}
