package pages;

import org.openqa.selenium.WebDriver;

public class CategoriesPage extends BasePage {

    public CategoriesPage(WebDriver driver) {
        super(driver);
        popularProducts = new ListOfProductsPage(driver);
        menu = new TopMenuPage(driver);
    }

    ListOfProductsPage popularProducts;
    TopMenuPage menu;
}
