Feature: TalentTEK Sign In feature test

  @regression @smoke @prod
  Scenario: User should be able to sign in with valid credentials
    Given I am at talentTEK Home Page
    And I enter student email address
    And I enter student password
    When I click on Login button
    Then I should be successfully log in

  @signIn @regression @smoke @prod
  Scenario: User should be able to sign in with valid credentials
    Given I am at talentTEK Home Page
    And I enter student email address as "qa.test559@gmail.com"
    And I enter student password as "Te$t1234"
    #And I enter password "Te$t1234"
    When I click on Login button
    Then I should be successfully log in

  @signIn @regression @smoke @prod
  Scenario: User should be able to sign in with valid credentials
    Given I am at talentTEK Home Page
    And I enter student email address as "232@gmail.com"
    And I enter student password as "tesfd@232"
    When I click on Login button
    Then I should be successfully log in

