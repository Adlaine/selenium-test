#language: pt
#Version: 1.0
#Author: 
#Encoding: UTF-8
@API @REST @Regressivo
Funcionalidade: Fruit Shop API - Customers

  Cenario: Consulta de customer
    Dado o endpoint Customers do Fruit Shop API
    Quando o usuario buscar o cliente "342"
    Então o endpoint Customers retorará
      | firstname | lastname |
      | Alice     | Eastman  |
