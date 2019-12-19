#language: pt
#Version: 1.0
#Author:Adlaine Tosta
@Nacionalidade
Funcionalidade: Nacionalidade

  Contexto: 
    Dado que o usuario esteja na pagina de login Orange HRM
    E o usuario preerncher o painel de login
      | username | password |
      | Admin    | admin123 |

  @adcionarNacionalidade
  Cenario: Adicionar uma nacionalidade
    Quando o usuario inserir uma nacionalidade
      | nacionalidade |
      | aaaaaa13       |
    Então a nacionalidade foi inserida com sucesso
      | nacionalidade |
      | aaaaaa13       |

  @excluirNacionalidade
  Cenario: Excluir uma nacionalidade
    Quando o usuario excluir uma nacionalidade
      | nacionalidade |
      | aaaaaa13      |
    Então a nacionalidade foi excluida com sucesso
      | nacionalidade |
      | aaaaaa13      |
