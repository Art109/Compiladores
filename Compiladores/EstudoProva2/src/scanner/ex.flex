package scanner;
import java_cup.runtime.Symbol;
import parser.sym;


%%

%class Scanner
%unicode
%cup
%line
%column
%public

%{
		public Scanner(java.io.InputStream in) {
				this(new java.io.InputStreamReader(in, java.nio.charset.Charset.forName("UTF-8")));
		}
%}

digito = [0-9]
letra = [a-zA-Z]
inteiro = {digito}+

fimdeLinha = \r|\n|\r\n
espaco = {fimdeLinha} | [ \t\f]
opMais = "+"
opMenos = "-"
opDiv = "/"
opMult = "*"
opMod = "%"

ident = {letra}({letra}|{digito})*

%%

{inteiro} { 
		double aux = Double.parseDouble(yytext());
		return new Symbol(sym.INTEIRO, new Double(aux)); 
}

/**
 * O do atributo sym.<nome> que usaremos aqui
 * é o nome que demos la no arquivo .cup 
 */	
{opMais} { return new Symbol(sym.MAIS);	}

{opMenos} { return new Symbol(sym.MENOS);}
{opDiv}  {return new Symbol(sym.DIV);}
{opMult} { return new Symbol(sym.MULT);}
{opMod} {return new Symbol(sym.MOD);}
";" { return new Symbol(sym.PTVIRG);}

"(" { return new Symbol(sym.ABREPAR); }
")" { return new Symbol(sym.FECHAPAR);}

"[" {return new Symbol(sym.ABRE_COLCH);}
"]" {return new Symbol(sym.FECHA_COLCH);}
"{" {return new Symbol(sym.ABRECHAVE);}
"}" {return new Symbol(sym.FECHACHAVE);}

"." {return new Symbol(sym.PTO);}

{ident} {return new Symbol(sym.IDENT, yytext());}

{espaco} { /* despreza */ }

.|\n { /* Caractere inválido */ 		
	return new Symbol(sym.EOF, yyline, yycolumn, yytext());		
	}