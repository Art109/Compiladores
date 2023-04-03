%%
%standalone
%line
%column
%class At4


numero = [0-9]
numeros = {numero}{numero}*
numerosNegativo = "-"{numeros}
numeroFlutuante = ({numeros}|{numerosNegativo})"."({numeros})
fracao = "/"({numeros}|{numerosNegativo}|{numeroFlutuante}|{numeroExponencial})|ε
numeroExponencial = ("E"("+"|"-")?({numeros}|{numeroFlutuante}))?
numeroReal = ({numeros}|{numerosNegativo}|{numeroFlutuante}){fracao}*{numeroExponencial}*


%%

{numeroReal} {System.out.println("<num: "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }

