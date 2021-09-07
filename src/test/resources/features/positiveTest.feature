Feature: Test1 - Positive Test

  Scenario:  Robot hoover can perform its functionality when presented with positive coordinates.
    Given That the Robot is initialized and working in a 5x5 square room
    When  The robot starts at the start coordinate
    And   The robot follows the direction instructions
    Then  Robot should end up on the end coordinates specified in payload
    And   Robot should have cleaned amount of patches specified in payload

