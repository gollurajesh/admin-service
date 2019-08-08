Feature: the message can be retrieved
  Scenario: client makes call to POST /getUser
  When the client calls /getUser with values 1
  Then the client receives userid 3