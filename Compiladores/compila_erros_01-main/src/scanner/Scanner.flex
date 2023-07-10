//---------------------------------------------------------
// 		>>>>>>	1 secao    <<<<<<<
// O codigo colocado aqui, na primeira secao,
// E copiado, sem alteracoes, para o programa do usuario
//---------------------------------------------------------

package scanner;
import java_cup.runtime.Symbol;
import parser.sym;

%%

//---------------------------------------------------------
// 		>>>>>  2 secao  <<<<<<<
// opcoes para customizar o programa gerado
// e declaracoes de macros que podem ser usadas
// nas definicoes dos lexemes
//---------------------------------------------------------


%class Scanner
%cupsym sym
%cup
%unicode   // permite usar caracteres unicode
%line      // permite usar yyline
%column    // permite usar yycolumn
%public

%eofval{
    return new Symbol(sym.EOF);	
%eofval}

// código inserido na classe
%{ 
	

%}


FimdeLinha = \r|\n|\r\n
Espaco = {FimdeLinha} | [ \t]
Inteiro = 0 | [1-9][0-9]*
OpMais= "+"
OpMenos = "-"
OpMult= "*"
OpDiv = "/"
PtoVirg = ";"
OpMaior=">"
OpMenor="<"
OpMaiorIgual=">="
OpMenorIgual="<="
OpIgualIgual="=="
OpDiferente="!="

KwIf = "if"
KwElse = "else"
abrePar = "("
fechaPar = ")"
abreChave = "{"
fechaChave = "}"

%%
// 		>>>>>  3 secao  <<<<<<<

{Espaco} {/*despreza*/} 

{Inteiro} {
	Double aux = Double.parseDouble (yytext());
	return new Symbol(sym.NUMBER, new Double (aux));
}

{OpMais} { 
    return new Symbol(sym.MAIS);
}

{OpMenos} { 
    return new Symbol(sym.MENOS);
}

{PtoVirg} { 
    return  new Symbol(sym.PTVIRG);
}

{OpMult} { 
    return  new Symbol(sym.MULT);
}

{OpDiv} { 
    return  new Symbol(sym.DIV);
}

{OpMaior} { 
    return  new Symbol(sym.MAIOR);
}

{OpMenor} { 
    return new Symbol(sym.MENOR);
}

{OpMaiorIgual} { 
    return new Symbol(sym.MAIORIGUAL);
}

{OpMenorIgual} { 
    return new Symbol(sym.MENORIGUAL);
}

{OpIgualIgual} { 
    return new Symbol(sym.IGUALIGUAL);
}

{OpDiferente} { 
    return new Symbol(sym.DIF);
}

{KwIf} { 
    return new Symbol(sym.KW_IF);
}

{KwElse} { 
    return new Symbol(sym.KW_ELSE);
}

{abrePar} { 
    return new Symbol(sym.ABREPAR);
}

{fechaPar} { 
    return new Symbol(sym.FECHAPAR);
}

{abreChave} { 
    return new Symbol(sym.ABRECHAVE);
}

{fechaChave} { 
    return new Symbol(sym.FECHACHAVE);
}

/*erro*/
.|\n {	
	throw new Error("Caractere Ilegal <"+yytext()+">");
}