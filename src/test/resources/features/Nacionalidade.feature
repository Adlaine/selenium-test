#language: pt
#Version: 1.0
#Author:Adlaine Tosta
@Nacionalidade
Funcionalidade: Nacionalidade

 @adcionarNacionalidade
    Cenario: Adicionar uma nacionalidade
    	Dado que o usuario esteja na pagina de login Orange HRM
    	E o usuario preerncher o painel de login
      	| username  | password |
      	| Admin     | admin123 |
    	Quando o usuario inserir uma nacionalidade
    		|nacionalidade|
    		|baiano   |
    	Então a nacionalidade foi inserida com sucesso
