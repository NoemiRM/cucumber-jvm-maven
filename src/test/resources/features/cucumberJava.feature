Feature: CucumberJava
    As an user of the application

Scenario: Search specific city's temperature
    Given I am an user of the system
    When I search the temperature of "Lima"
    Then The system return the following temperature "28"