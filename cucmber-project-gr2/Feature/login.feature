
Feature: Вход в системата

  Scenario: Вход в системата с валидни потребителски данни
    Given Портебителя отваря екрана за вход в системата
    When Въвежда потребителско име "Ivan"
    And Въвежда парола "Pass123"
    And Натиска бутона за вход в системата
    Then Вижда съобщение за успех.

