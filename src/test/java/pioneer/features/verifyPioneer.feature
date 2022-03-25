@login
Feature: Pioneer Center login page

   @incorrect_email_password
  Scenario Outline: Verify error message displays
    When Input to Email textbox with "<Email>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
    Then Verify error message displays
     
    Examples:
| Email                | Password| 
| admin123@vtl-vtl.com | 123456  | 
| admin@vtl-vtl.com    | 111111  |

  
    @login_with_valid_email_password
  Scenario: Login with valid email and password
    
    When Input to Email textbox with "admin@vtl-vtl.com"
    And Input to Password textbox with "123456"
    And Click to Submit button
    Then Homepage displays
    