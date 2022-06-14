Algoritmo "bar"

Var

   qtsCerveja, qtsRefrigerante, qtsEspeto, consumo, couvert, ingresso, cerveja, refri, espetinho, totalCerveja, totalEspeto, TotalRefri, total: real
   genero : caractere
   


Inicio

      escreva ("Sexo: [F/M]")
      leia(genero)
      
      cerveja <- 5.00
      refri <- 3.00
      espetinho <- 7.00
      couvert <- 4.00
      ingresso <- 10.00

      
      se genero = "F" entao
         escreva ("Quantidade de cervejas: ")
         leia(qtsCerveja)
         escreva ("Quantidade de refrigerantes: ")
         leia(qtsRefrigerante)
         escreva ("Quantidade de espetinhos: ")
         leia(qtsEspeto)

         
         totalCerveja <- cerveja * qtsCerveja
         totalRefri <- refri * qtsRefrigerante
         totalEspeto <- espetinho * qtsEspeto
         
         consumo <- totalCerveja + totalRefri + TotalEspeto
         
         escreval
         escreval ("RELATÓRIO: ")
         escreval ("Consumo = ", consumo:3:2)
             se consumo >= 30 entao
                escreval("Isento de Couvert")
             senão
                consumo <- consumo + couvert
             fimse
             

         escreval ("Couvert = ", couvert:3:2)
         escreval ("Ingresso = ", ingresso - 2:3:2)
         
         total <- consumo + (ingresso - 2)
         
         escreval ("Valor a pagar = ", total:3:2)
         //homem
         senao
         escreva ("Quantidade de cervejas: ")
         leia(qtsCerveja)
         escreva ("Quantidade de refrigerantes: ")
         leia(qtsRefrigerante)
         escreva ("Quantidade de espetinhos: ")
         leia(qtsEspeto)


         totalCerveja <- cerveja * qtsCerveja
         totalRefri <- refri * qtsRefrigerante
         totalEspeto <- espetinho * qtsEspeto

         consumo <- totalCerveja + totalRefri + TotalEspeto

         escreval
         escreval ("RELATÓRIO: ")
         escreval ("Consumo = ", consumo:3:2)
             se consumo >= 30 entao
                escreval("Isento de Couvert")
             senão
                consumo <- consumo + couvert
             fimse


         escreval ("Couvert = ", couvert:3:2)
         escreval ("Ingresso = ", ingresso:3:2)

         total <- consumo + ingresso

         escreval ("Valor a pagar = ", total:3:2)
      fimse

Fimalgoritmo