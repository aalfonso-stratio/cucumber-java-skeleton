#@hook
Feature: Belly

#  Background: drink some water
#    Given I drink some water

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

#  Scenario: regular expression problem
#    Given I want to eat fruit
#    And I want to eat cukes

#  Scenario: a lot of cakes
#    Given I have 200 cukes in my belly
#    When I wait 2 hour
#    Then my belly should burp

#  Scenario Outline: some cakes
#    Given I have <cukes> cukes in my belly
#    When I wait <time> hour
#    Then my belly should <action>
#    Examples:
#      | cukes | time | action |
#      | 42    | 1    | growl  |
#      | 200   | 2    | burp   |

#  Scenario: data table
#    Given I enter new user
#      | name    | John  |
#      | surname | Smith |
#      | height  | 1.82  |
#      | weight  | 84.5  |