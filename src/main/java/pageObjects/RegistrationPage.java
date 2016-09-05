package pageObjects;

import core.MethodsFactory;
import org.openqa.selenium.By;

/**
 * Created by Alex Astakhov on 04.09.2016.
 */
public class RegistrationPage extends MethodsFactory {
    private By affeilirateButton = By.xpath(".//*[@class='register-affiliate-link']");
    private By advertiserButton = By.xpath(".//*[@class='register-advertiser-link']");
    private By affName = By.id("name");
    private By affEmail = By.id("email");
    private By affPass = By.id("password");
    private By affRepeatPass = By.id("repeat_password");
    private By affSkype = By.xpath(".//*[@class='registration_form master_registration_form']//*[@id='skype']");
    private By affWmr = By.id("wmr");
    private By affAgree = By.id("check1");
    private By affSubmitButton = By.xpath("//*[contains(@class,'send_button send_if_checked')]");
    private By rulesLink = By.xpath(".//*[@class='chk chk_agree form-item']//a[@href='/rules']");
    private By advFio = By.id("name2");
    private By advEmail = By.id("email2");
    private By advPhone = By.id("phone");
    private By advSkype = By.xpath(".//*[@class='registration_form advertiser_order_form']//*[@id='skype']");
    private By advCompany = By.id("company");
    private By advProduct = By.id("product");
    private By advSite = By.id("website");
    private By advTarget = By.id("target-button");
    private By advPayout = By.id("payout");
    private By advAudience = By.id("audience");
    private By advAmount = By.id("audience_amount");
    private By advUsedCPA = By.id("used_cpa");
    private By advGeography = By.id("geography");
    private By advContext = By.id("check2");
    private By advMedia = By.id("check3");
    private By advTeaser = By.id("check4");
    private By advTargetVK = By.id("check5");
    private By advTargetMailRu = By.id("check6");
    private By advEmailMarketig = By.id("check7");
    private By advOther = By.xpath(".//input[@value='other']");
    private By AdvPostclick = By.id("postclick");
    private By AdvQualitySources = By.id("quality_sources");
    private By AdvTrafficSources = By.id("traffic_sources");
    private By AdvSubmit = By.cssSelector(".send_button");


}
