Feature: In order to test Home Page of application
  As a Registered user
  I want to specify the features of home page


Background: Login with valid username and password with parameter
Given Enter URL "https://s1.demo.opensourcecms.com/wordpress/wp-login.php"
When Enter username "opensourcecms" and password "opensourcecms"
And Click on login button
Then User must successfully login to the application

@AddUser
Scenario Outline: Add User scene
Then Here click on User
When navigated on Add user page
And Enter username "<username>" , email "<email>" , Firstname "<Firstname>" , Lastname "<Lastname>"
And Click on Add button
Then User must successfully add user to list
Examples:
 | username | email | Firstname | Lastname |
 | pavanoltraining | Test@selenium123.com | pavanol | tain |


@EditUser
Scenario: Existing User is Edited
When On user list and select user to edit
And Click on edit user
Then User edited and updated successfully

@FileUpload
Scenario: Uploading a valid file 
    Given I visit the file upload page
      When I upload a file with valid data 
      Then the file is one
      And File should be in page

Scenario: Uploading a malformed file
      Given I visit the file upload page
      When I upload a malformed file
      Then the number of files is one
      And I should see the file upload page again error
      
@DeleteUser
Scenario: User gets deleted
When On user list and select user
And Click on delete user
Then User delete successfully



