package pageObjects;

import core.MethodsFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 04.09.2016.
 */
public class Footer extends MethodsFactory {
    private By rules = By.xpath(".//*[@class='footer__item']//*[@href='/rules']");
    private By faq = By.xpath(".//*[@class='footer__item']//*[@href='/faq']");
    private By putProject = By.xpath(".//*[@class='footer__item']//*[@href='/registration#advertiser']");
    private By about = By.xpath(".//*[@class='footer__item']//*[@href='/about']");
    private By contacts = By.xpath(".//*[@class='footer__item']//*[@href='/contacts']");
    private By privacyPolicy = By.xpath(".//*[@class='footer__item']//*[@href='/privacy']");
    public By advRegTitle = By.xpath(".//h4[text()='Регистрация рекламодателя']");

    @Step
    public void clickRules(){
        click(rules);
    }
    @Step
    public void clickFaq(){
        click(faq);
    }
    @Step
    public void clickPutProject(){
        click(putProject);
    }
    @Step
    public void clickAbout(){
        click(about);
    }
    @Step
    public void clickContacts(){
        click(contacts);
    }
    @Step
    public void clickPrivacy(){
        click(privacyPolicy);
    }
}
