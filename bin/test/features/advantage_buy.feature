Feature: buy a tablet on Advantage page
  I as a user want to buy a tablet on the advantage page

  Background: 
    Given he is logged into the page Username  'UserPrueba' and Password  'Ingreso2020'
    When he has selected a tablet and add the product to the shopping cart

  Scenario: buy a tablet
    Given he chooses to pay with mastercard
    When he enter card information and press click pay
      | CardHolderName  | User prueba  |
      | CardNumber      | 343568764534 |
      | expirationMonth |           05 |
      | expirationYear  |         2024 |
      | CVVNumber       |         9742 |
    Then he can see a transaction approval message 'Thank you for buying with Advantage'
