# language: pt
Funcionalidade: Saudação inicial da API
  Como pessoa desenvolvedora
  Quero validar o endpoint de saudação
  Para garantir que o app foi inicializado com sucesso

  Cenario: Consultar saudação padrão
    Dado que a API esta em execucao
    Quando eu consultar o endpoint de saudacao
    Entao devo receber status 200
    E a resposta deve conter a mensagem padrao
