//---------------------------------------------------------
// 		>>>>>>	1 secao    <<<<<<<
// O codigo colocado aqui, na primeira secao,
// E copiado, sem alteracoes, para o programa do usuario
//---------------------------------------------------------

package scanner;
import java_cup.runtime.Symbol;
import parser.sym;
import erros.ListaErros;

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
    return criaSimbolo(sym.EOF);	
%eofval}

// código inserido na classe
%{ 
	//atributo
	private ListaErros listaErros; 

	//Redefinindo "sobrecarga" o construtor de  Scanner 
	//para inicializar tambem listaErros
	public Scanner(java.io.FileReader in, ListaErros listaErros) {
		this(in);
		this.listaErros = listaErros;
	}
	
	public ListaErros getListaErros() { 
		return listaErros; 
	}

	public void defineErro(int linha, int coluna, String texto) {
		listaErros.defineErro(linha, coluna, texto);
	}	

	//sera usado pelo syntax_error()
	public void defineErro(int linha, int coluna) {
		listaErros.defineErro(linha, coluna);
	}

	//Nós utilizaremos para colocar legenda no local inserido pelo syntax_erro()
	//Temos que fazer assim, pois o syntax_erro é chamado automaticamente e
	//não conseguimos sobrecarrega-lo, porém conseguimos que ele preencha nossa lista de erros
	public void defineErro(String texto) {
		listaErros.defineErro(texto);
	}

	//Wrapper utilizado para facilitar a criacao de Symbol e incorporação
	//da linha e coluna em todos os Tokens
	private Symbol criaSimbolo(int code, Object value) {
		return new Symbol(code, yyline, yycolumn, value);
	}
	
	private Symbol criaSimbolo(int code) {		
		return new Symbol(code, yyline, yycolumn, null);
	}

%}

//macro
ident = {letra}({letra}|{digito})*


letraMin = [a-z]
qualquerLetra = [a-zA-Z]
digito = [0-9]
ident = {letraMin}({qualquerLetra}|{digito})*
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
KwDo = "do"
KwWhile = "while"

abrePar = "("
fechaPar = ")"
abreChave = "{"
fechaChave = "}"
abreColch = "["
fechaColch = "]"
ponto = "."

%%
// 	>>>>>  3 secao  <<<<<<<

{Espaco} {/*despreza*/} 

{Inteiro} {
	Double aux = Double.parseDouble (yytext());
	return criaSimbolo(sym.NUMBER, new Double (aux));
}

{OpMais} { 
    return criaSimbolo(sym.MAIS);
}

{OpMenos} { 
    return criaSimbolo(sym.MENOS);
}

{PtoVirg} { 
    return  criaSimbolo(sym.PTVIRG);
}

{OpMult} { 
    return  criaSimbolo(sym.MULT);
}

{OpDiv} { 
    return  criaSimbolo(sym.DIV);
}

{OpMaior} { 
    return  criaSimbolo(sym.MAIOR);
}

{OpMenor} { 
    return criaSimbolo(sym.MENOR);
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

{KwElse} { 
    return criaSimbolo(sym.KW_ELSE);
}

{KwDo} { 
    return criaSimbolo(sym.KW_DO);
}

{KwWhile} { 
    return criaSimbolo(sym.KW_WHILE);
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

{abreColch} {
    return criaSimbolo(sym.ABRECOLCH);
}

{fechaColch} {
    return criaSimbolo(sym.FECHACOLCH);
}

{ponto} {
    return criaSimbolo(sym.PONTO);
}

{ident} {
    return criaSimbolo(sym.IDENT);
}

/*erro*/
.|\n {
	this.defineErro(yyline, yycolumn, "Lexico - Simbolo desconhecido:"+yytext() );
	//throw new Error("Caractere Ilegal <"+yytext()+">");
}