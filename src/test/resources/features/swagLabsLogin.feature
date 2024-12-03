#language: pt
Funcionalidade: Login

  Cenario:Login com standar user
    Dado que o usuario esta no site Swag Labs na pagina de login
    Quando o usuario prencher username com "standard_user"
    E o usuario preencher password com "secret_sauce"
    E o usuario logar
    Entao a Pagina Swag Labs exibe a pagina de produtos