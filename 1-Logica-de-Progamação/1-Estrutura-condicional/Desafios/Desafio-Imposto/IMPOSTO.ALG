algoritmo "imposto"
var

   anualSalario, anualServico, anualCapital, rendaMensal, impostoSalario, medico, educacao : real
   impostoServico, maximoDedutivel, totalDevido, impostoCapital, juros10, juros15, juros20, juros30, totalDeducao, impostoTotal, abatimento : real

inicio

      escreva (" Renda anual com sal�rio: ")
      leia(anualSalario)
      escreva (" Renda anual com presta��o de servi�o: ")
      leia(anualServico)
      escreva (" Renda anual com ganho de capital: ")
      leia(anualCapital)
      escreva (" Gastos m�dicos: ")
      leia(medico)
      escreva (" Gastos educacionais: ")
      leia(educacao)
      
      juros10 <- 0.10
      juros15 <- 0.15
      juros20 <- 0.2
      juros30 <- 0.3
      
      rendaMensal <- anualSalario / 12
      
      escreval
      escreval (" RELAT�RIO DE IMPOSTO DE RENDA ")
      escreval
      
      se rendaMensal < 3000 entao
         escreval (" Voc� e isento de imposto sobre o salario ")
      senao
           se (rendaMensal >= 3000) e (rendaMensal < 5000)  entao
                impostoSalario <- anualSalario * juros10
                escreval (" Imposto sobre sal�rio: ", impostoSalario:6:2)
           senao
                impostoSalario <- anualSalario * juros20
                escreval (" Imposto sobre sal�rio: ", impostoSalario:6:2)
           fimse
      fimse
      
      se anualServico > 0 entao
                impostoServico <- anualServico * juros15
                escreval(" Imposto sobre servi�os: ", impostoServico:6:2)
      senao
                escreval(" Imposto sobre servi�os: ", anualServico:6:2)
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
      escreval (" DEDU��ES: ")
      
      se totalDeducao > abatimento entao
         maximoDedutivel <- abatimento
         escreval(" M�ximo dedut�vel: ", maximoDedutivel:6:2)
      senao
         maximoDedutivel <- totalDeducao
      fimse

         escreval (" Gastos dedut�veis: ", totalDeducao:6:2)
  
      
      escreval
      
       totalDevido <- impostoTotal - maximoDedutivel

      escreval (" RESUMO:")
      escreval (" Imposto bruto total: ", impostoTotal:6:2)
      escreval (" Abatimento: ", maximoDedutivel:6:2)
      escreval (" Imposto devido: ", totalDevido:6:2)
      


fimalgoritmo