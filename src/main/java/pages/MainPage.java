package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
        popularProducts = new ListOfProductsPage(driver);
        menu = new TopMenuPage(driver);
    }

    ListOfProductsPage popularProducts;
    TopMenuPage menu;
}
