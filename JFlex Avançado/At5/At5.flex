%%
%standalone
%line
%column
%class At5

letra = [A-Za-z]
numero = [0-9]
numeros = {numero}{numero}*
ident = {letra}({letra}|{numero})*

fimdeLinha = \r|\n|\r\n
branco = " "
espaco = ({fimdeLinha}|[ \t]|{branco})*

KW_COUT = "cout"
concat = "<<"
qualquerLetra = .
texto = ({qualquerLetra}|{numeros})*
msgTela = {KW_COUT}{espaco}{concat}{espaco}{texto}";"

%%

{msgTela} {System.out.println("<msgTela: "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }
