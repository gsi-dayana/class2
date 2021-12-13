Feature: Account Settings
  As a: GoHeavy Admin / Fleet Owner / Dispatcher / Document Approver / Retailer Admin / Store Admin /
  Store User / Customer
  I Want To: edit profile information				
  So That: I can update my user profile.

  Background: 
    Given Any user is logged

  Scenario: Update Settings
    Given The user is in "Account Settings" view
    When User insert valid data
    And clicks on the "Update" button
    Then The system saves the user profile information
    And The system displays popup with success message: "Your profile was successfully updated"

  Scenario: Opens a file selection dialog window for the user to search the image file
    Given The user is in "Account Settings" view
    When User clicks on the component used for image uploading
    Then The system opens a file selection dialog window for the user to search the file in his device
