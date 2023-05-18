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

%{   //codigo java para funcionar entrada via teclado. Explicação abaixo.
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
opMult = "*"
opDiv = "/"
opMod = "%"
open_Parent = "("
close_Parent = ")"
comentario = "//"((letra)*|(digito)*)*

%%

{comentario} { return new Symbol(sym.COMENTARIO);}

{inteiro} { 
		int aux = Integer.parseInt (yytext());
		return new Symbol (sym.INTEIRO, new Integer(aux)); 
}

{opMais} { return new Symbol(sym.MAIS);	}
{opMult} { return new Symbol(sym.MULT);	}
{opDiv} { return new Symbol(sym.DIV);	}
{opMod} { return new Symbol(sym.MOD);	}



"-" { return new Symbol(sym.MENOS);}

";" { return new Symbol(sym.PTVIRG);}

{espaco} { /* despreza */ }

{open_Parent} { return new Symbol(sym.ABRE_PARENT);}
{close_Parent} { return new Symbol(sym.FECHA_PARENT);}

.|\n { /* Caractere inválido */ 		
	return new Symbol(sym.EOF, yyline, yycolumn, yytext());		
	}
