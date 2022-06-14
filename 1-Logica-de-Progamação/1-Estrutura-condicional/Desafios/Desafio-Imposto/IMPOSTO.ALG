algoritmo "imposto"
var

   anualSalario, anualServico, anualCapital, rendaMensal, impostoSalario, medico, educacao : real
   impostoServico, maximoDedutivel, totalDevido, impostoCapital, juros10, juros15, juros20, juros30, totalDeducao, impostoTotal, abatimento : real

inicio

      escreva (" Renda anual com salário: ")
      leia(anualSalario)
      escreva (" Renda anual com prestação de serviço: ")
      leia(anualServico)
      escreva (" Renda anual com ganho de capital: ")
      leia(anualCapital)
      escreva (" Gastos médicos: ")
      leia(medico)
      escreva (" Gastos educacionais: ")
      leia(educacao)
      
      juros10 <- 0.10
      juros15 <- 0.15
      juros20 <- 0.2
      juros30 <- 0.3
      
      rendaMensal <- anualSalario / 12
      
      escreval
      escreval (" RELATÓRIO DE IMPOSTO DE RENDA ")
      escreval
      
      se rendaMensal < 3000 entao
         escreval (" Você e isento de imposto sobre o salario ")
      senao
           se (rendaMensal >= 3000) e (rendaMensal < 5000)  entao
                impostoSalario <- anualSalario * juros10
                escreval (" Imposto sobre salário: ", impostoSalario:6:2)
           senao
                impostoSalario <- anualSalario * juros20
                escreval (" Imposto sobre salário: ", impostoSalario:6:2)
           fimse
      fimse
      
      se anualServico > 0 entao
                impostoServico <- anualServico * juros15
                escreval(" Imposto sobre serviços: ", impostoServico:6:2)
      senao
                escreval(" Imposto sobre serviços: ", anualServico:6:2)
      fimse
      
      se anualCapital > 0 entao
                impostoCapital <- anualCapital * juros20
                escreval(" Imposto sobre ganho de capital: ", impostoCapital:6:2)
      senao
                escreval(" Imposto sobre ganho de capital: ", anualCapital6:2
      fimse
      

      
      impostoTotal <- impostoSalario + impostoServico + impostoCapital
      totalDeducao <-  medico + educacao
      abatimento <- impostoTotal * juros30
      
      escreval
      escreval (" DEDUÇÕES: ")
      
      se totalDeducao > abatimento entao
         maximoDedutivel <- abatimento
         escreval(" Máximo dedutível: ", maximoDedutivel:6:2)
      senao
         maximoDedutivel <- totalDeducao
      fimse

         escreval (" Gastos dedutíveis: ", totalDeducao:6:2)
  
      
      escreval
      
       totalDevido <- impostoTotal - maximoDedutivel

      escreval (" RESUMO:")
      escreval (" Imposto bruto total: ", impostoTotal:6:2)
      escreval (" Abatimento: ", maximoDedutivel:6:2)
      escreval (" Imposto devido: ", totalDevido:6:2)
      


fimalgoritmo