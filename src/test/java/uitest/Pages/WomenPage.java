package uitest.Pages;

import com.codeborne.selenide.SelenideElement;
import uitest.BaseTest;

import static com.codeborne.selenide.Selenide.$;

public class WomenPage extends BaseTest {
    private static SelenideElement categoryName = $(".cat-name");

    public static String getWomenCategoryName(){
        return categoryName.getOwnText();
    };
}
