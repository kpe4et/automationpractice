package uitest.tests;

import org.junit.Assert;
import org.junit.Test;
import uitest.Pages.LandingPage;

import static uitest.Pages.WomenPage.getWomenCategoryName;

public class WomenTest {
    private final static String BASE_URL = "http://automationpractice.com/";
    private final static String CATEGORYNAME = "Women";

    /**
     * Проверим, соответствует попали ли мы на правильную страницу, через сверку имени категории
     */
    @Test
    public void checkCategoryName(){
        LandingPage landingPage = new LandingPage(BASE_URL);
        landingPage.clickWomen();
        Assert.assertTrue(getWomenCategoryName().contains(CATEGORYNAME));
    }
}
