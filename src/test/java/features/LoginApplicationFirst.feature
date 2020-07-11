
Feature: Login with First Url

   Scenario Outline:  Testing First Url
    Given user is on homepage using first url
    Then user enter username "<UserName>" and User enter password "<Password>" for first url
    When user navigates to Login Page using first url
    Then Close the first url browser

    Examples: 
      | UserName| Password|
      | AB1     | 12345 |
  
  
   
  