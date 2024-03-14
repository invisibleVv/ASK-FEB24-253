@FEB-24-253
  Feature: Registration - "First Name"

    @FEB-24-255
    Scenario: [T][S][Registration] Verify that 'First Name' field accepts only latin character
      Given Navigate to "Registration" page
      When Enter "Latin character" into "First Name" input field
      And Fill out the rest of the form input fields as required
      Then Click on the "Register Me" button at the bottom of the page


    @FEB-24-256
    Scenario: [T][S][Registration] Verify that "First Name" field cannot be empty
      Given Navigate to "Registration" page
      Then Leave the "First Name" field empty
      Then Click on an "Empty Space" on the page


    @FEB-24-257
    Scenario: [T][S][Registration] Verify "First Name" field accepts up to 254 characters when "Last Name" is 1 character
      Given Navigate to "Registration" page
      When Enter "254 characters" into "First Name" input field
      And Fill out the rest of the form input fields as required
      Then Click on the "Register Me" button at the bottom of the page


    @FEB-24-258
    Scenario: [T][S][Registration] Verify "First Name" field accepts 1 character (minimum)
      Given Navigate to "Registration" page
      When Enter "1 character" into "First Name" input field
      And Fill out the rest of the form input fields as required
      Then Click on the "Register Me" button at the bottom of the page


    @FEB-24-259
    Scenario: [T][S][Registration] Verify "First Name" field does not accept white spaces
      Given Navigate to "Registration" page
      When Enter "Name with space" into "First Name" input field
      Then Click on an "Empty Space" on the page


    @FEB-24-260
    Scenario: [T][S][Registration] Verify that "First Name" field does not accept more than 254 characters
      Given Navigate to "Registration" page
      When Enter "More than 254 characters" into "First Name" input field
      And Fill out the rest of the form input fields as required
      Then Click on the "Register Me" button at the bottom of the page


    @FEB-24-261
    Scenario: [T][S][Registration] Verify "First Name" field rejects entry when only special characters are used
      Given Navigate to "Registration" page
      When Enter "Special Character" into "First Name" input field
      Then Click on an "Empty Space" on the page


    @FEB-24-262
    Scenario: [T][S][Registration] Verify "First Name" field rejects entry with leading and trailing spaces at the beginning or end
      Given Navigate to "Registration" page
      When Enter " Tester " into "First Name" input field
      Then Click on an "Empty Space" on the page


    @FEB-24-263
    Scenario: [T][S][Registration] Verify "First Name" field rejects entry with consecutive white spaces between characters
      Given Navigate to "Registration" page
      When Enter "Test er" into "First Name" input field
      Then Click on an "Empty Space" on the page