#language: pt
#Version: 1.0
#Author:Adlaine Tosta
@Login
Funcionalidade: Login

  @loginSucesso
  Cenario: Fazer login com credenciais validas
    Dado que o usuario esteja na pagina de login Orange HRM
    Quando o usuario preerncher o painel de login
      | username  | password |
      | Admin     | admin123 |
    Então o usuario estará logado

  @loginInvalido
  Cenario: Fazer login com credenciais invalidas
    Dado que o usuario esteja na pagina de login Orange HRM
    Quando o usuario preerncher o painel de login
      | username | password |
      | Admin    | admin12  |
    Então o usuario receberá uma mensagem de credenciais invalidas
