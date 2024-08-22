Feature: Login Page
 Scenario Outline: To Login Page scenario
    Given user open the website and go to login page
    When user fill "<username>" and "<password>" and click login
    Then user should navigate to home page
   Examples:
     |     username                     |     password              |
     |     Mostafa.org1@itworxedu.com   |     Windows.2000          |
     |     nouran.org1@itworxedu.com    |     Windows.2000          |

