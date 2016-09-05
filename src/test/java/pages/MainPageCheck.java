package pages;

import core.BrowserFactory;
import listeners.ListenerWithBrowserShot;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.Footer;
import pageObjects.MainPage;
import pageObjects.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Alex Astakhov on 04.09.2016.
 */
@Listeners({ListenerWithBrowserShot.class})
public class MainPageCheck extends BrowserFactory {
    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void getMainPage(){
        mainPage.openPage();
    }

    @Parameters({"email", "password"})   // проверка входа незарегистрированного пользователя
    @Test
    @Description("Check enter with incorrect e-mail/password")
    public void checkIncorrectEnter(@Optional("alex-astakhov@ukr.net") String email, @Optional("12345678") String passw){

        mainPage.clickEnterButton();
        mainPage.waitForElement(mainPage.emailField);
        type(mainPage.emailField, email);
        type(mainPage.passwField, passw);
        mainPage.clickSubmitEnterButton();
        Assert.assertTrue(driver().findElement(mainPage.loginErrorText).isDisplayed());
    }

    @Test
    @Description("Check web-developer's registration page via banner")
    public void checkAffiliateRegistrationBanner(){  // проверка регистрации веб-мастера с использованием баннера
        mainPage.openPage();
        mainPage.clickAffiliateBanner();
        mainPage.clickSignButton();
        Assert.assertTrue(driver().getCurrentUrl().contains("#affiliate"));
    }

    @Test
    @Description("Check advertiser's registration page via banner")
    public void checkAdvertiserRegistrationBanner(){ // проверка регистрации рекламодателя с использованием баннера
        mainPage.openPage();
        mainPage.clickAdvertiserBanner();
        mainPage.clickSignButton();
        Assert.assertTrue(driver().getCurrentUrl().contains("#advertiser"));
    }

    @Test
    @Description("Check web-developer's registration page via button")
    public void checkAffiliateRegistrationButton(){ // проверка регистрации веб-мастера с использованием кнопки
        mainPage.openPage();
        mainPage.clickAffiliateButton();
        mainPage.clickSignButton();
        Assert.assertTrue(driver().getCurrentUrl().contains("#affiliate"));
    }


    @Test
    @Description("Check advertiser's registration page via button")
    public void checkAdvertiserRegistrationButton(){  // проверка регистрации рекламодателя с использованием кнопки
        mainPage.openPage();
        mainPage.clickAdvertiserButton();
        mainPage.clickSignButton();
        Assert.assertTrue(driver().getCurrentUrl().contains("#advertiser"));
    }

}
