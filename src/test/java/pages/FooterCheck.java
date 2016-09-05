package pages;

import core.BrowserFactory;
import listeners.ListenerWithBrowserShot;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.Footer;
import pageObjects.MainPage;
import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Alex Astakhov on 04.09.2016.
 */
@Listeners({ListenerWithBrowserShot.class})
public class FooterCheck extends BrowserFactory {

    Footer footer = new Footer();

    @BeforeClass
    public void openPage(){
        MainPage mainPage = new MainPage();
        mainPage.openPage();
    }

    @Test
    @Description("Check Rules link")
    public void rulesLinkCheck() throws InterruptedException {
        footer.clickRules();
        Assert.assertEquals(getH4Text(), "Правила сети Everad.ru");
    }

    @Test
    @Description("Check FAQ link")
    public void faqLinkCheck(){
        footer.clickFaq();
        Assert.assertEquals(getH4Text(), "Часто задаваемые вопросы (FAQ)");
    }

    @Test
    @Description("Check Project link")
    public void putProjectLinkCheck(){
        footer.clickPutProject();
        String pageSource = driver().getPageSource();
        Assert.assertTrue(pageSource.contains("Регистрация рекламодателя"));
        Assert.assertTrue(driver().findElement(footer.advRegTitle).isDisplayed());
    }

    @Test
    @Description("Check About link")
    public void aboutLinkCheck(){
        footer.clickAbout();
        Assert.assertEquals(getH2Text(), "Дайте хороший старт вашему заработку");
    }

    @Test
    @Description("Check Contacts link")
    public void contactsLinkCheck(){
        footer.clickContacts();
        Assert.assertEquals(getH4Text(), "Наши адреса");
    }

    @Test
    @Description("Check Privacy link")
    public void PrivacyLinkCheck(){
        footer.clickPrivacy();
        Assert.assertEquals(getH4Text(), "Политика конфиденциальности сайта Everad");
    }

}
