Feature:

  #Scenario: Это описание нашей задачи
  #Given Предусловие с чего должны начать
   # And Это продолжение Given
    #When Когда я на что то нажимаю
    #Then Я должен увидеть Самсунг

  Background: Вход в мир LEXUS
    Given Я зашел на сайт "lexus.com"

  Scenario: Покупка Lexus lx570
    And Я должен пролистать вниз и должен увидеть "EXPLORE YOUR LEXUS"
    And Я должен выбрать модель "LX"
    #And Я должен увидеть последний модель "lx570"
    And Цена должна начинаться с 86930 долларов
    When Когда я нажал на кнопку build
    And Сайт должен запросить zipCode
    And Я должен ввести zipcode 0312
    And Я должен выбрать модель "2021 LX 570 THREE-ROW"
    And Во вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
    And Цена "lx570" должен поменяться с 93700 на 93275
    And Я должен нажать на кпопку Summary
    And Я должен увидеть "YOU'LL TURN HEADS" такой текст
    And Я должен нажать на кнопку Send to dealer
    And Сайт выдал анкету для заполнения
    And В поле First name я должен ввести "Murat"
    And В поле Last name  я должен ввести "Shorukov"
    And В поле Email должен ввести "mura@gmail.com"
    And В поле Phone number должен ввести 996555111222
    Then Я должен увидеть "THANK YOU. WE'LL BE IN TOUCH SHORTLY" текст


  Scenario: Купит RX350
    And Я должен пролистать вниз и должен увидеть "EXPLORE YOUR LEXUS"
    And Я должен выбрать модель "RX"
   # And Я должен увидеть последний модель "rx350"
    And Цена должна начинаться с 45320 долларов
    When Когда я нажал на кнопку build
    And Сайт должен запросить zipCode
    And Я должен ввести zipcode 0312
    And Я должен выбрать модель "2021 RX 350 THREE-ROW"
    And Во вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
    And Цена "lx350" должен поменяться с 45320 на 50000
    And Я должен нажать на кпопку Summary
    And Я должен увидеть "YOU'LL TURN HEADS" такой текст
    And Я должен нажать на кнопку Send to dealer
    And Сайт выдал анкету для заполнения
    And В поле First name я должен ввести "Murat"
    And В поле Last name  я должен ввести "Shorukov"
    And В поле Email должен ввести "mura@gmail.com"
    And В поле Phone number должен ввести 996555111222
    Then Я должен увидеть "THANK YOU. WE'LL BE IN TOUCH SHORTLY" текст

  Scenario: Купит LS410
    And Я должен пролистать вниз и должен увидеть "EXPLORE YOUR LEXUS"
    And Я должен выбрать модель "LS"
   # And Я должен увидеть последний модель "ls410"
    And Цена должна начинаться с 70000 долларов
    When Когда я нажал на кнопку build
    And Сайт должен запросить zipCode
    And Я должен ввести zipcode 0312
    And Я должен выбрать модель "2021 LS 430 THREE-ROW"
    And Во вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
    And Цена "LS410" должен поменяться с 70000 на 75000
    And Я должен нажать на кпопку Summary
    And Я должен увидеть "YOU'LL TURN HEADS" такой текст
    And Я должен нажать на кнопку Send to dealer
    And Сайт выдал анкету для заполнения
    And В поле First name я должен ввести "Murat"
    And В поле Last name  я должен ввести "Shorukov"
    And В поле Email должен ввести "mura@gmail.com"
    And В поле Phone number должен ввести 996555111222
    Then Я должен увидеть "THANK YOU. WE'LL BE IN TOUCH SHORTLY" текст

