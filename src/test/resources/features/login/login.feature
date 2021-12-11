Feature: Test

  Scenario Outline: Allowing and redirecting user according to its access
    Given The unauthenticated GoHeavy User is in the Login view
    When User insert email "<emails>" and password "<passwords>"
    And User clicks on the "Sign in" button
    Then The system allows the user access to the system
    And Sytem redirects to "<views>" view

    Examples: 
      | emails             | passwords | views             |
      | novanick@gmail.com | @User123  | Dashboard         |
      | evakings@gmail.com | @User123  | Drivers List      |
      | piper95@gmail.com  | @User123  | Fleet Owners List |
