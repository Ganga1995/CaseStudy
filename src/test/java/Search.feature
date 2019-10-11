Feature: search

Scenario: Searching headphones
Given launch web browser
When login and search for product
Then Payment done
Scenario: Unsuccessful search
Given launch web browser again
When login and search for product not found
Then unsuccessfull
Scenario: Unsuccessful search when blank
Given launch web browser again when blank
When login and search for product not found when blank
Then unsuccessfull when blank