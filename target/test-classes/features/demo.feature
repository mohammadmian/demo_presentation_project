Feature: Login 

Scenario: USer should not be able to login with invalid credentials 
	Given The user has navigated to the login page 
	When The user clicks login after entering invalid username "invaliduser" and password "invalidpassword" 
	Then The user should see the invalid username or password message as "Your login is invalid. Please try again."