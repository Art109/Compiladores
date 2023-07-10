//---------------------------------------------------------
// 		>>>>>>	1 secao    <<<<<<<
// O codigo colocado aqui, na primeira secao,
// E copiado, sem alteracoes, para o programa do usuario
//---------------------------------------------------------

package scanner;
import java_cup.runtime.Symbol;
import parser.sym;
import Erro.ListaErros;

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

    private ListaErros listaErros;

    public Scanner(java.io.FileReader in, ListaErros listaErros)
    {
        this(in);
        this.listaErros = listaErros;
    }

    public ListaErros getListaErros()
    {
        return listaErros;
    }


    public void defineErro(int l, int c, String texto)
    {
        listaErros.defineErro(l,c,texto);
    }
    
    public void defineErro(int linha, int coluna)
    {
        listaErros.defineErro(linha,coluna);
    }

    public void defineErro(String texto)
    {
        listaErros.defineErro(texto);
    }

    private Symbol criaSimbolo(int code, Object value)
    {
        return new Symbol(code, yyline, yycolumn, value);
    }
    
    public Symbol criaSimbolo(int code)
    {
        return new Symbol(code, yyline, yycolumn, null);
    }
	

%}


FimdeLinha = \r|\n|\r\n
Espaco = {FimdeLinha} | [ \t]
Inteiro = 0 | [1-9][0-9]*
OpMais= "+"
OpMenos = "-"
OpMult= "*"
OpDiv = "/"
OpMod = "%"
PtoVirg = ";"
OpMaior=">"
OpMenor="<"
OpMaiorIgual=">="
OpMenorIgual="<="
OpIgualIgual="=="
OpDiferente="!="

KwIf = "if"
KwElse = "else"
KW_WHILE = "while" 
KW_DO = "do"
abrePar = "("
fechaPar = ")"
abreChave = "{"
fechaChave = "}"

%%
// 		>>>>>  3 secao  <<<<<<<

{Espaco} {/*despreza*/} 

{Inteiro} 
{
    return criaSimbolo(sym.NUMBER, yytext());
}

{OpMais} 
{ 
    return criaSimbolo(sym.MAIS);
}

{OpMenos} { 
    return criaSimbolo(sym.MENOS);
}

{PtoVirg} { 
    return criaSimbolo(sym.PTVIRG);
}

{OpMult} { 
    return criaSimbolo(sym.MULT);
}

{OpDiv} { 
    return criaSimbolo(sym.DIV);
}

{OpMaior} { 
    return criaSimbolo(sym.MAIOR);
}

{OpMenor} { 
    return criaSimbolo(sym.MENOR);
}

{OpMod} {
    return criaSimbolo(sym.MOD);
}

{OpMaiorIgual} { 
    return criaSimbolo(sym.MAIORIGUAL);
}

{OpMenorIgual} { 
    return criaSimbolo(sym.MENORIGUAL);
}

{OpIgualIgual} { 
    return criaSimbolo(sym.IGUALIGUAL);
}

{OpDiferente} { 
    return criaSimbolo(sym.DIF);
}

{KwIf} { 
    return criaSimbolo(sym.KW_IF);
}

{KW_WHILE} {
    return criaSimbolo(sym.KW_WHILE)
}

{KW_DO} {
    return criaSimbolo(sym.KW_DO)
}

{KwElse} { 
    return criaSimbolo(sym.KW_ELSE);
}

{abrePar} { 
    return criaSimbolo(sym.ABREPAR);
}

{fechaPar} { 
    return criaSimbolo(sym.FECHAPAR);
}

{abreChave} { 
    return criaSimbolo(sym.ABRECHAVE);
}

{fechaChave} { 
    return criaSimbolo(sym.FECHACHAVE);
}

/*erro*/
.|\n {	
	this.defineErro(yyline, yycolumn, "Lexico - Simbolo Desconhecido:" + yytext());
}

