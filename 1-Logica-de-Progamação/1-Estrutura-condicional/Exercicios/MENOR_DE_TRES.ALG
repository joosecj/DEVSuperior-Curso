algoritmo "menor_de_tres"
var

   a, b, c, menor : inteiro

inicio

      escreva ("Primeiro valor: ")
      leia(a)
      escreva ("Segundo valor: ")
      leia(b)
      escreva ("Tercero valor: ")
      leia(c)
      
      se (a < b) e (a < c) entao
         menor <- a
      senao
        se b < c entao
           menor <- b
        senao
         menor <- c
        fimse
      fimse
      
      escreval (" MENOR = ", menor)
      

fimalgoritmo