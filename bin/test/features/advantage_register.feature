Feature: create account
  I as a user want to create an account on Advange Demo
  
  Scenario: create an account on Avantage Demo
    Given he enter the Avantage Demo page
    When he enter a new account
      | userNameAccount    | UserPrueba           |
      | mailAccount        | userprueba@gmail.com |
      | passwordAccount    | Ingreso2020          |
      | confirmPassAccount | Ingreso2020          |
      | firstName          | user                 |
      | lastName           | prueba               |
      | phoneNumber        | 3184228320           |
      | country            | Colombia             |
      | city               | Bogota               |
      | address            | Cra 106 141 -32      |
      | state              | Suba                 |
      | postalCode         | 57                   |
    Then he can see your username 'UserPrueba' on the screen