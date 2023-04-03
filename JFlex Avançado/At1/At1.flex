

%%


%standalone
%line 
%column
%class At1

Ling01 = (aa|bb|(ab|ba)(ba|ab))*
Resto = .|.{Ling01}|[Ling01].

%%

{Ling01} {System.out.println("Ling01 " + yytext() + ", linha:" + yyline + ", coluna:" + yycolumn);}
{Resto} {System.out.println("Rejeita");}
