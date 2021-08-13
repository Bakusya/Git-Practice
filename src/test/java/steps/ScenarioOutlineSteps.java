package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineSteps {

    @Given("^Я как пользователь должен зайти на \"([^\"]*)\"$")
    public void я_как_пользователь_должен_зайти_на(String facebook)  {
        System.out.println("Я как пользователь зашел на сайт" + facebook);
   
       
    }

    @Given("^В поле email вводим \"([^\"]*)\"$")
    public void в_поле_email_вводим(String email)  {
        System.out.println("В поле email ввела " + email);
   
       
    }

    @Given("^В поле пароль вводим \"([^\"]*)\"$")
    public void в_поле_пароль_вводим(String password)  {
        System.out.println("В поле пароль ввела" + password);
   
       
    }

    @When("^Я должен нажать на кнопку войти в систему$")
    public void я_должен_нажать_на_кнопку_войти_в_систему()  {
        System.out.println("Я нажал на кнопку войти в систему");
   
       
    }

    @Then("^Система должен вывести ошибку \"([^\"]*)\"$")
    public void система_должен_вывести_ошибку(String errorSystem)  {
        System.out.println("Система вывел ошибку");
   
       
    }

}
