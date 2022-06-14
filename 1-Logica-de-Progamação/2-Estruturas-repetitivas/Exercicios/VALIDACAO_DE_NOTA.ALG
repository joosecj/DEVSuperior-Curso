algoritmo "validacao_de_nota"
var

   media, nota1, nota2 : real

inicio


      escreva ("Digite a primeira nota: ")
      leia(nota1)
      
      enquanto (nota1 < 0) ou (nota1 > 10) faca
               escreva("Valor invalido! Tente novamente: ")
               leia(nota1)
      fimenquanto
      
      escreva ("Digite a segunda nota: ")
      leia(nota2)
      
      enquanto (nota1 < 0) ou (nota1 > 10) faca
               escreva("Valor invalido! Tente novamente: ")
               leia(nota1)
      fimenquanto
      
      
      media <- (nota1 + nota2) / 2
      escreval("MEDIA = ", media:6:2)

fimalgoritmo