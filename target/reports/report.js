$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ScenarioOutline.feature");
formatter.feature({
  "line": 1,
  "name": "Scenario Outline feature",
  "description": "",
  "id": "scenario-outline-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Проверка логин функции",
  "description": "",
  "id": "scenario-outline-feature;проверка-логин-функции",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Я как пользователь должен зайти на \"fb.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "В поле email вводим \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "В поле пароль вводим \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Я должен нажать на кнопку войти в систему",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Система должен вывести ошибку \"Вы ввели не правильные данные\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "scenario-outline-feature;проверка-логин-функции;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 11,
      "id": "scenario-outline-feature;проверка-логин-функции;;1"
    },
    {
      "cells": [
        "test@test.com",
        "123456"
      ],
      "line": 12,
      "id": "scenario-outline-feature;проверка-логин-функции;;2"
    },
    {
      "cells": [
        "test123@gmail.com",
        "Hello123"
      ],
      "line": 13,
      "id": "scenario-outline-feature;проверка-логин-функции;;3"
    },
    {
      "cells": [
        "john@yahoo.com",
        "Password123@#"
      ],
      "line": 14,
      "id": "scenario-outline-feature;проверка-логин-функции;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Проверка логин функции",
  "description": "",
  "id": "scenario-outline-feature;проверка-логин-функции;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Я как пользователь должен зайти на \"fb.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "В поле email вводим \"test@test.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "В поле пароль вводим \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Я должен нажать на кнопку войти в систему",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Система должен вывести ошибку \"Вы ввели не правильные данные\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "fb.com",
      "offset": 36
    }
  ],
  "location": "ScenarioOutlineSteps.я_как_пользователь_должен_зайти_на(String)"
});
formatter.result({
  "duration": 373691200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 21
    }
  ],
  "location": "ScenarioOutlineSteps.в_поле_email_вводим(String)"
});
formatter.result({
  "duration": 158900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 22
    }
  ],
  "location": "ScenarioOutlineSteps.в_поле_пароль_вводим(String)"
});
formatter.result({
  "duration": 215600,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOutlineSteps.я_должен_нажать_на_кнопку_войти_в_систему()"
});
formatter.result({
  "duration": 944800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Вы ввели не правильные данные",
      "offset": 31
    }
  ],
  "location": "ScenarioOutlineSteps.система_должен_вывести_ошибку(String)"
});
formatter.result({
  "duration": 951000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Проверка логин функции",
  "description": "",
  "id": "scenario-outline-feature;проверка-логин-функции;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Я как пользователь должен зайти на \"fb.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "В поле email вводим \"test123@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "В поле пароль вводим \"Hello123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Я должен нажать на кнопку войти в систему",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Система должен вывести ошибку \"Вы ввели не правильные данные\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "fb.com",
      "offset": 36
    }
  ],
  "location": "ScenarioOutlineSteps.я_как_пользователь_должен_зайти_на(String)"
});
formatter.result({
  "duration": 3556400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123@gmail.com",
      "offset": 21
    }
  ],
  "location": "ScenarioOutlineSteps.в_поле_email_вводим(String)"
});
formatter.result({
  "duration": 270100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello123",
      "offset": 22
    }
  ],
  "location": "ScenarioOutlineSteps.в_поле_пароль_вводим(String)"
});
formatter.result({
  "duration": 186700,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOutlineSteps.я_должен_нажать_на_кнопку_войти_в_систему()"
});
formatter.result({
  "duration": 639300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Вы ввели не правильные данные",
      "offset": 31
    }
  ],
  "location": "ScenarioOutlineSteps.система_должен_вывести_ошибку(String)"
});
formatter.result({
  "duration": 4001000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Проверка логин функции",
  "description": "",
  "id": "scenario-outline-feature;проверка-логин-функции;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Я как пользователь должен зайти на \"fb.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "В поле email вводим \"john@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "В поле пароль вводим \"Password123@#\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Я должен нажать на кнопку войти в систему",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Система должен вывести ошибку \"Вы ввели не правильные данные\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "fb.com",
      "offset": 36
    }
  ],
  "location": "ScenarioOutlineSteps.я_как_пользователь_должен_зайти_на(String)"
});
formatter.result({
  "duration": 37297700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john@yahoo.com",
      "offset": 21
    }
  ],
  "location": "ScenarioOutlineSteps.в_поле_email_вводим(String)"
});
formatter.result({
  "duration": 164400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password123@#",
      "offset": 22
    }
  ],
  "location": "ScenarioOutlineSteps.в_поле_пароль_вводим(String)"
});
formatter.result({
  "duration": 384500,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOutlineSteps.я_должен_нажать_на_кнопку_войти_в_систему()"
});
formatter.result({
  "duration": 685900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Вы ввели не правильные данные",
      "offset": 31
    }
  ],
  "location": "ScenarioOutlineSteps.система_должен_вывести_ошибку(String)"
});
formatter.result({
  "duration": 718600,
  "status": "passed"
});
});