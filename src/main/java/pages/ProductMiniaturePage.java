package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.math.BigDecimal;

public class ProductMiniaturePage extends BasePage {
    public ProductMiniaturePage(WebDriver driver, WebElement element) {
        super(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(element), this);
    }

    @FindBy(className = "product-title")
    private WebElement name;

    @FindBy(className = "regular-price")
    private WebElement priceBeforeDiscount;

    @FindBy(className = "discount-percentage")
    private WebElement discountLabel;

    @FindBy(className = "price")
    private WebElement price;

    @FindBy(className = "new")
    private WebElement newLabel;

    @FindBy(css = "img")
    private WebElement image;

    public BigDecimal getPrice(){
        //BigDecimal - obiekt do wyświetlania cen
        String price = this.price.getText().replace("$","");
        //this - ze wzgledu na to, że zmienna ma taka sama nazwe jak webelememt

        return new BigDecimal(price);

    }



}
