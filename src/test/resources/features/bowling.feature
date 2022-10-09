Feature: Bowling game utility
  Scenario Outline: Player rolls for a frame
    Given a bowling game <game>
    When a player rolls 2 times and knocks over <pins1> and <pins2>
    Then the score is <score>
    Examples:
      | pins1 | pins2 | score |
      | 4     | 4     | 8     |
      | 5     | 4     | 9     |
      | 1     | 3     | 4     |

    Scenario Outline: Player completes a game
      Given a bowling game
      When a player completes a game with rolls and scores <scores>
      Then final score <finalScore> is calculated
      Examples:
        | scores                          | finalScore |
        | 10, 10, 10, 4, 4, 4, 4, 4, 5, 5 | 102        |


