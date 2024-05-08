Feature: Belly growling

  Scenario Outline: Eating cucumbers and waiting to see if belly growls
    Given I have eaten <cukes> cukes
    When I wait <hours> hour
    Then my belly should <result>

    Examples:
      | cukes | hours | result          |
      | 5     | 1     | not growl       |
      | 20    | 2     | growl           |
      | 10    | 3     | not growl       |
      | 15    | 2     | growl           |

  Scenario: Belly should not growl with insufficient cucumbers and time
    Given I have eaten 3 cukes
    When I wait 1 hour
    Then my belly should not growl

  Scenario: Belly should growl after eating a lot and waiting enough
    Given I have eaten 12 cukes
    When I wait 2 hour
    Then my belly should growl

