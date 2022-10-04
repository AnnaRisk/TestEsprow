import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckPayment {

    @BeforeAll

    static  void beforeAll() {

        Configuration.baseUrl = "https://spa-dev.etpmarkets.com:3000";
    }


    @Test


    void LoginUser (){

            open ("/auth/sign-in");

        $(byName("email")).setValue("test.qa.2@esprow.com");
        $(byName("password")).setValue("temporaryAccount");



        $x("//*[@class=\"sc-AykKE sc-LzMCI cafzer\"]").pressEnter();


    }


    @Test


    void AddExchangeMove (){
        open ("/app/subscription");
        $x("//*[@class=\"sc-AykKE guaEXt subscription-add-exchange-button\"]").pressEnter();
    }


}
