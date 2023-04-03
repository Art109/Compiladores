%%
%standalone
%line
%column
%class At5

KW_IF = "if"
KW_WHILE = "while"
KW_INT = "int"
KW_FLOAT = "float"
KW_DOUBLE = "double"
KW_CHAR = "char"
KW_STRING = "String"
KW_BOOL = "boolean"
KW_PRINT = "print"

Type = {KW_BOOL}|{KW_CHAR}|{KW_DOUBLE}|{KW_FLOAT}|{KW_INT}|{KW_STRING}


letra = [A-Za-z]
numero = [0-9]
numeros = {numero}{numero}*
ident = {letra}({letra}|{numero})*
decVarUnica = {Type}{espaco}{ident}{espaco}"="{espaco}({texto}|{numeros}|letra+)";"

fimdeLinha = \r|\n|\r\n
branco = " "
espaco = ({fimdeLinha}|[ \t]|{branco})*

KW_COUT = "cout"
concat = "<<"
qualquerLetra = .
texto = ({qualquerLetra}|{numeros})*
msgTela = {KW_COUT}({espaco}{concat}{espaco}({texto}|{ident}))+";"

%%

{msgTela} {System.out.println("<msgTela: "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }
