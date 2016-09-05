package pageObjects;

import core.MethodsFactory;
import org.openqa.selenium.By;

/**
 * Created by Alex Astakhov on 04.09.2016.
 */
public class Header extends MethodsFactory {
    private By logo = By.cssSelector(".logo-wrap");
    private By affiliateLink = By.xpath(".//*[contains(@class, 'affiliate-link')]");
    private By advertiserLink = By.xpath(".//*[contains(@class, 'advertiser-link')]");
    private By about = By.xpath(".//*[@class='nav']//*[@href='/about']");
    private By contacts = By.xpath(".//*[@class='nav']//*[@href='/contacts']");
    private By enterButton = By.xpath("//*[contains(@class, 'enter_button')]");

}
