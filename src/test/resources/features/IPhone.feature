Feature:Test


  # This is comment
  # Gherkin --> Given,Then,And,When,




  Scenario: Пользователь должен войти в систему с корректными данными
    Given Я как пользователь должен открыть сайт Facebook.com
    And Пользователь должен ввести в поле свой email адрес
    And  Пользователь должен ввести в поле пароль  свой Пароль
    When Пользователь нажмет на кнопку Логин
    Then Пользователь должен благополучно войти в систему


    Scenario: Проверка вычитания
      Given Я должен зайти на сайт Svetofor.kg
      And Я должен найти наушники для IPhone
      And У меня на карте 100долларов
      And Наушники стоят 30 долларов
      When Я нажимаю на кнопку купить
      And Сайт должен снять с моей карты 30 долларов
      Then У меня на карте должен остаться 70 долларов





