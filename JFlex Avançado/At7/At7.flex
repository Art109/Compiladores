%%
%standalone
%line
%column
%class At7

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
decVarUnica = {Type}{espaco}{ident}({espaco}"="{espaco}({texto}|{numeros}|{letra}+)?)?";"
atribuicaoVar = {ident}{espaco}"="{espaco}({texto}|{numeros}|letra+)";"

fimdeLinha = \r|\n|\r\n
branco = " "
espaco = ({fimdeLinha}|[ \t]|{branco})*

KW_COUT = "cout"
concat = "<<"
qualquerLetra = .
texto = ({qualquerLetra}|{numeros})*
msgTela = {KW_COUT}({espaco}{concat}{espaco}({texto}|{ident}))+";"

operadorLogico = ">"|"<"|"=="|"!="|">="|"<="
expressaoLogica = ("true"|({ident}|{numeros}){espaco}{operadorLogico}{espaco}({ident}|{numeros})|"false")
bloco = "{"({espaco}*.{espaco}*)*"}"
while = {KW_WHILE}"("{expressaoLogica}")"{bloco}


%%

{decVarUnica} {System.out.println("<varDec "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }
{msgTela} {System.out.println("<msgTela: "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }
{while} {System.out.println("<while: "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }
{bloco} {System.out.println("<bloco: "+ yytext()+ ", linha:"+ yyline + ", coluna:"+ yycolumn +">" ); }
