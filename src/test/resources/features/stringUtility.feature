Feature: String utility

  Scenario Outline: Reverse string
    Given Utility is given valid <string> input
    When Utility reverse string method is called
    Then Reversed output string is <reversed>
    Examples:
      | string    | reversed  |
      | "aBc"     | "cBa"     |
      | "Racecar" | "racecaR" |

    Scenario Outline: Capitalize string
      Given Utility is given a valid <string> input
      When Utility capitalize string method is called
      Then Capital output string is <capitalized>
      Examples:
        | string    | capitalized |
        | "abc"     | "ABC"       |
        | "racecar" | "RACECAR"   |

  Scenario Outline: Lowercase string
    Given Utility is given a valid capital <string> input
    When Utility lowercase string method is called
    Then Lowecase output string is <lowercase>
    Examples:
      | string | lowercase |
      | "ABC"  | "abc"     |
      | "BOOM" | "boom"    |
