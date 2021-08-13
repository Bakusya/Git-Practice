package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IPhoneSteps {



    @Given("^Я как пользователь должен открыть сайт Facebook\\.com$")
    public void я_как_пользователь_должен_открыть_сайт_Facebook_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Я зашел на сайт facebook");

    }

    @Given("^Пользователь должен ввести в поле свой email адрес$")
    public void пользователь_должен_ввести_в_поле_свой_email_адрес() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь должен ввести в поле пароль  свой Пароль$")
    public void пользователь_должен_ввести_в_поле_пароль_свой_Пароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Пользователь нажмет на кнопку Логин$")
    public void пользователь_нажмет_на_кнопку_Логин() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Пользователь должен благополучно войти в систему$")
    public void пользователь_должен_благополучно_войти_в_систему() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


        @Given("^Я должен зайти на сайт Svetofor\\.kg$")
        public void я_должен_зайти_на_сайт_Svetofor_kg() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Я зашел на сайт svetofor.kg");

        }

        @Given("^Я должен найти наушники для IPhone$")
        public void я_должен_найти_наушники_для_IPhone() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("я нашел наушники AirPod");

        }

        @Given("^У меня на карте (\\d+)долларов$")
        public void у_меня_на_карте_долларов(int balance) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("у меня на балансе " + balance);

        }

        @Given("^Наушники стоят (\\d+) долларов$")
        public void наушники_стоят_долларов(int headPhonePrice) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Стоимость наушников " + headPhonePrice  + " USD");

        }

        @When("^Я нажимаю на кнопку купить$")
        public void я_нажимаю_на_кнопку_купить() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Я нажал на кнопку купить ");

        }

        @When("^Сайи должен снять с моей карты (\\d+) долларов$")
        public void сайи_должен_снять_с_моей_карты_долларов(int withDraw) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Сайт снял с моей карты " + withDraw + " USD");


        }

        @Then("^У меня на карте должен остаться (\\d+) долларов$")
        public void у_меня_на_карте_должен_остаться_долларов(int remainingBalance) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("У меня на карте осталась " + remainingBalance + " USD");

        }


    }


