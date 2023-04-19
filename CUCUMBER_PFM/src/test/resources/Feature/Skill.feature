Feature: I am automation functionality of Add Skills in Orange HRM application
	
Background: Common step
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Successful Login with valid page
    And User enters username as "Admin" and password as "admin123"
    Then Go to Skill Page
  |Skillname|skill descr|
  |Skill01  |Skill01 descr|
  |Skill02| Skill02 descr|
  |Skill03| Skill03| descr|
  
  
    When Click on logout button
    Then Close Browser
 
      