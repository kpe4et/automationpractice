package uitest.tests;

import org.junit.Assert;
import org.junit.Test;
import uitest.BaseTest;
import uitest.Pages.LandingPage;

import static uitest.Pages.ContactPage.header;

public class ContactTitleTest extends BaseTest {
    private final static String CONTACTTITLE = "Customer service - Contact us";
    private final static String BASE_URL = "http://automationpractice.com/";

    @Test
    public void checkHeader(){
        LandingPage landingpage = new LandingPage(BASE_URL);
        landingpage.getContacts();
        header.getOwnText();
        Assert.assertTrue(header.getOwnText().contains(CONTACTTITLE));
    }
}
