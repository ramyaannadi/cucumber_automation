@BPM
Feature: To Test BPM Portal

  @BPMAddHaluer
  Scenario: To Add one Haluer and accept the haluer to complete the task
    Given I Navigate to BPM Portal
    When I Login to BPM
    Given I Click on All Task Tab
    And I Search CaseId "004009-118226-2662529"
    Then I Click on Add3 Contact Button
    And I Click on Claim
    Given I Select LOA Details "Yes, LOA looks OK"
    Then I Click on Add Haluer Button
    When I Add Hauler Details
    Then I Select Haulers Agree To The Terms
    Given I Add Contracted Haluer Details
    Then I Click on Complete Task
		And I Click on Logout

  @BPMAddHaluer1
  Scenario: To upload customer document and add Haluer and complete the task
    Given I Navigate to BPM Portal
    When I Login to BPM
    Given I Click on All Task Tab
    And I Search CaseId "004009-118229-2662532"
    And I Click on the Case Link "004009-118229-2662532"
    And I Click on Claim
    Given I Upload Customer Document
    Then I Click on Complete Task
    Given I Click on the Cases Tab
    Given I Search CaseId "004009-118229-2662532"
    And I Click on the Case Link "004009-118229-2662532"
    Then I Click on Add3 Contact Button
    And I Click on Claim
    Given I Select LOA Details "Yes, LOA looks OK"
    Then I Click on Add Haluer Button
    When I Add Hauler Details
    Then I Select Haulers Agree To The Terms
    Given I Add Contracted Haluer Details
    Then I Click on Complete Task
    And I Click on Logout
