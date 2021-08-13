package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LexusSteps {

    @Given("^Я зашел на сайт \"([^\"]*)\"$")
    public void я_зашел_на_сайт(String lexusWebSite) {
        System.out.println("Я зашел на сайт " + lexusWebSite);


    }


    @Given("^Я должен пролистать вниз и должен увидеть \"([^\"]*)\"$")
    public void я_должен_пролистать_вниз_и_должен_увидеть(String text) {
        System.out.println("Я пролистал вниз и увидел текст " + text);

    }

    @Given("^Я должен выбрать модель \"([^\"]*)\"$")
    public void я_должен_выбрать_модель(String modelLexus) {
        System.out.println("Я выбрал модель " + modelLexus);


    }


    @Given("^Цена должна начинаться с (\\d+) долларов$")
    public void цена_должна_начинаться_с_долларов(int startPrice)  {
        System.out.println("Цена выбранного моделя начинается" + startPrice);


    }

    @When("^Когда я нажал на кнопку build$")
    public void когда_я_нажал_на_кнопку_build() {
        System.out.println("Я нажал на кнопку build");
      
    
    }

    @When("^Сайт должен запросить zipCode$")
    public void сайт_должен_запросить_zipCode() {
        System.out.println("Сайт запросил zip code");
      
    
    }

    @When("^Я должен ввести zipcode (\\d+)$")
    public void я_должен_ввести_zipcode(int zipCode) {
        System.out.println("Я указал" + zipCode);
      
    
    }


    @When("^Во вкладке \"([^\"]*)\" я должен выбрать \"([^\"]*)\"$")
    public void во_вкладке_я_должен_выбрать(String colors, String lxColor)  {


  }

        @When("^Цена \"([^\"]*)\" должен поменяться с (\\d+) на (\\d+)$")
    public void цена_должен_поменяться_с_на(String lx570, int oldPrice, int newPrice)  {


    }

    @When("^Я должен нажать на кпопку Summary$")
    public void я_должен_нажать_на_кпопку_Summary()  {


    }



    @When("^Я должен увидеть \"([^\"]*)\" такой текст$")
    public void я_должен_увидеть_такой_текст(String arg1) {
      
    
    }

    @When("^Я должен нажать на кнопку Send to dealer$")
    public void я_должен_нажать_на_кнопку_Send_to_dealer() {
      
    
    }

    @When("^Сайт выдал анкету для заполнения$")
    public void сайт_выдал_анкету_для_заполнения() {
      
    
    }

    @When("^В поле First name я должен ввести \"([^\"]*)\"$")
    public void в_поле_First_name_я_должен_ввести(String name)  {
        System.out.println("В поле first name ввел " + name);


    }

    @When("^В поле Last name  я должен ввести \"([^\"]*)\"$")
    public void в_поле_Last_name_я_должен_ввести(String lastName)  {
        System.out.println("В поле last name ввел " + lastName );


    }

    @When("^В поле Email должен ввести \"([^\"]*)\"$")
    public void в_поле_Email_должен_ввести(String mail)  {
        System.out.println("Я ввела email " + mail);


    }


    @When("^В поле Phone number должен ввести (\\d+)$")
    public void в_поле_Phone_number_должен_ввести(int phoneNumber) {
        System.out.println("Я ввел номер телефона " + phoneNumber);
      
    
    }

    @Then("^Я должен увидеть \"([^\"]*)\" текст$")
    public void я_должен_увидеть_текст(String lastText) {
        System.out.println("Вышел текст " + lastText);
      
    
    }
}

