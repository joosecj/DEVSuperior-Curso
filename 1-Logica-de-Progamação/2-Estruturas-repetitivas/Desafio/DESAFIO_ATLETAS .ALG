Algoritmo "DESAFIO_ATLETAS "

Var

   maisAlto, nome, sexo : caractere
   i, n : inteiro
   cont, contH, peso, testeAltura, altura, pesoMedio, alturaMedia, porcentagem : real
   soma, somaMulheres, contM : real

Inicio

   escreva("Qual a quantidade de atletas? ")
   leia(n)

   soma <- 0
   cont <- 0
   contH <- 0
   contM <- 0
   somaMulheres <- 0
   testeAltura <- 0

   para i de 0 ate n-1 faca
      escreval("Digite os dados do atleta numero ", i+1, ": ")
      escreva("Nome: ")
      leia(nome)
      escreva("Sexo [M/F]: ")
      leia(sexo)
        enquanto (sexo <> "F") e (sexo <> "M")faca
         escreva("Valor inexistente, tente novamente: ")
         leia(sexo)
        fimenquanto
      escreva("Altura: ")
      leia(altura)
         enquanto altura <= 0 faca
           escreva("Valor invalido! Favor digitar um valor positivo: ")
           leia(altura)
         fimenquanto
      escreva("Peso: ")
      leia(peso)
          enquanto peso <= 0 faca
            escreva("Valor invalido! Favor digitar um valor positivo: ")
            leia(peso)
          fimenquanto
   fimpara

      soma <- soma + peso
      cont <- cont + 1

      se altura > testeAltura entao
         maisAlto <- nome
         testeAltura <- altura
      fimse

      se sexo = "M" entao
         contH <- contH + 1
      fimse

   escreval

   escreval("RELATORIO: ")

   escreval

   pesoMedio <- soma / cont
   escreva("Peso médio dos atletas: ", pesoMedio:4:2)

   escreval

   escreva("Atleta mais alto: ", maisAlto)

   escreval

   porcentagem <- contH * 100 / n
   escreval("Porcentagem de homens: ", porcentagem:4:2, " %")
   
         se sexo = "F" entao
            somaMulheres <- somaMulheres + altura
            contM <- contM + 1
         senao
            escreval("Não há mulheres cadastradas !")
         fimse

   alturaMedia <- somaMulheres / contM

   escreval("Altura média das mulheres: ", alturaMedia:4:2)
   

Fimalgoritmo