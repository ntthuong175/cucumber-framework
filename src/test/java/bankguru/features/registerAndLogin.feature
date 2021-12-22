
Feature: Register And Login

@register_login
  Scenario: Register to System
  Given Open Register page
  When Input to email textbox
  And Click to Submit
  Then Get User and password info
  When Back to Login page
  And Submit valid info to Login form
  Then Homepage displayed