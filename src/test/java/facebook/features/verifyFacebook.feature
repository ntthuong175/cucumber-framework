@login
Feature: Facebook login page

 @no-param
  Scenario: Scenario have no parameter
    Given Open facebook application
    When Input to Username textbox
    And Input to Password textbox
    And Click to Submit button
    And Close application

@param_mark 
Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with "autotest@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button
    Then Close application
    
@param_without_mark 
Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with autotest@gmail.com
    And Input to Password textbox with 123456
    And Click to Submit button
    Then Close application
    
@multiple_param
Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with "autotest@gmail.com" and Password textbox with "123456"
    And Click to Submit button
    Then Close application
    
    
@datatable_scenario
Scenario Outline: Data table
    Given Open facebook application
    When Input to Username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
    Then Close application
    
    Examples:
    |Username|Password|
    |automation01@gmail.com|123456|
    |automation02@gmail.com|123456|
    |automation03@gmail.com|123456|
    |automation04@gmail.com|123456|
    