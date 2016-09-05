package pageObjects;

import core.MethodsFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 04.09.2016.
 */
public class MainPage extends MethodsFactory {
    public final String URL = "http://everad.ru/";
    private By affiliateBanner = By.xpath(".//*[contains(@class, 'banner_l')]");
    private By advertiserBanner = By.xpath(".//*[contains(@class, 'banner_r')]");
    private By affiliateButton = By.xpath(".//*[contains(@class, 'banner_l')]//*[contains(@class, 'affiliate-button')]");
    private By advertiserButton = By.xpath(".//*[contains(@class, 'banner_r')]//*[contains(@class, 'advertiser-button')]");
    private By enterButton = By.xpath("//*[contains(@class, 'enter_button')]");
    private By signButton = By.xpath("//*[contains(@class, 'sign_button')]");

    public By emailField = By.xpath(".//*[@id='login-container']//*[@name='email']");
    public By passwField = By.xpath(".//*[@id='login-container']//*[@name='password']");
    private By submitEnterButton = By.xpath(".//input[contains(@class,'enter_btn')]");

    //public By loginErrorText = By.xpath(".//*[@class='login-error-text']");
    public By loginErrorText = By.cssSelector(".login-error-text");

    @Step
    public void openPage(){
        driver().get(URL);
    }
    @Step
    public void clickAffiliateBanner(){
        click(affiliateBanner);
    }
    @Step
    public void clickAdvertiserBanner(){
        click(advertiserBanner);
    }
    @Step
    public void clickAffiliateButton(){
        click(affiliateButton);
    }
    @Step
    public void clickAdvertiserButton(){
        click(advertiserButton);
    }
    @Step
    public void clickEnterButton(){
        click(enterButton);
    }
    @Step
    public void clickSignButton(){
        click(signButton);
    }
    @Step
    public void clickSubmitEnterButton(){
        click(submitEnterButton);
    }




}
