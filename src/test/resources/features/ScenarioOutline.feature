Feature: Scenario Outline feature

  @Regression
  Scenario Outline:Проверка логин функции
    Given Я как пользователь должен зайти на "fb.com"
    And В поле email вводим "<email>"
    And В поле пароль вводим "<password>"
    When Я должен нажать на кнопку войти в систему
    Then Система должен вывести ошибку "Вы ввели не правильные данные"
    Examples:
      | email            |password      |
      |test@test.com     |   123456     |
      |test123@gmail.com |  Hello123    |
      |john@yahoo.com    |Password123@# |