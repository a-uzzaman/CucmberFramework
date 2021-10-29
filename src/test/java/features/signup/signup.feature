Feature: TalentTEK Sign up feature test

  Background: Create new user
    Given

  @signup @regression @smoke @prod
  Scenario: User should be able to sign up with valid email address
    Given I am at talentTEK Home Page
    And I click on Create New Account button
    And I enter student information with valid email address
    And I enter student DOB
      | Feb   | 2 | 2000   |
#    And I enter student gender as male
#    And I agree with from
#    When I click Create My Account button
#    Then I should be able to get an student Id

  @signup @regression
  Scenario: User should not be able to sign up with invalid email address
    Given I am at talentTEK Home Page
    And I click on Create New Account button
    And I enter student information with invalid email address
#    And I enter student dob
#    And I enter student gender as male
#    And I agree with from
#    When I click Create My Account button
#    Then I should get an invalid email error message

  @signup @regression
  Scenario: User should not be able to sign up with male radiobutton

  @signup @regression
  Scenario: User should not be able to sign up with female radiobutton

  @ScenarioOutline
  Scenario Outline: Use of different data from Scenario
    Given I am at talentTEK Home Page
    And I click on Create New Account button
    And I enter student information with valid email address
    But We use example for <Month>, <Day> and <Year>

    Examples:
      | Month | Day | Year         |
      | Feb     | 7  | 1987 |
      | Jul        | 12       | 1992     |