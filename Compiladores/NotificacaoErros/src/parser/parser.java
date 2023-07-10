
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

package parser;

import java_cup.runtime.*;
import Erro.ListaErros;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\010\012\000\002\002\004\000\002\012" +
    "\006\000\002\012\002\000\002\007\005\000\002\002\004" +
    "\000\002\002\003\000\002\003\004\000\002\004\005\000" +
    "\002\004\005\000\002\004\004\000\002\004\003\000\002" +
    "\006\005\000\002\006\005\000\002\006\003\000\002\005" +
    "\003\000\002\005\005\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\017\004\001\002\000\004\021\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\010\014\013\021\016\025\012\001\002\000\026\004" +
    "\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6" +
    "\013\ufff6\014\ufff6\022\ufff6\001\002\000\032\004\ufff3\005" +
    "\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3" +
    "\014\ufff3\015\053\016\054\022\ufff3\001\002\000\032\004" +
    "\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\011\ufff2\012\ufff2" +
    "\013\ufff2\014\ufff2\015\ufff2\016\ufff2\022\ufff2\001\002\000" +
    "\006\021\016\025\012\001\002\000\004\022\035\001\002" +
    "\000\022\004\026\005\027\006\031\007\025\010\032\011" +
    "\030\013\020\014\022\001\002\000\010\014\013\021\016" +
    "\025\012\001\002\000\010\013\020\014\022\022\021\001" +
    "\002\000\006\021\016\025\012\001\002\000\032\004\ufff1" +
    "\005\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013" +
    "\ufff1\014\ufff1\015\ufff1\016\ufff1\022\ufff1\001\002\000\006" +
    "\021\016\025\012\001\002\000\026\004\ufff8\005\ufff8\006" +
    "\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8" +
    "\022\ufff8\001\002\000\026\004\ufff9\005\ufff9\006\ufff9\007" +
    "\ufff9\010\ufff9\011\ufff9\012\ufff9\013\ufff9\014\ufff9\022\ufff9" +
    "\001\002\000\010\014\uffed\021\uffed\025\uffed\001\002\000" +
    "\010\014\ufff0\021\ufff0\025\ufff0\001\002\000\010\014\uffef" +
    "\021\uffef\025\uffef\001\002\000\010\014\uffeb\021\uffeb\025" +
    "\uffeb\001\002\000\010\014\uffee\021\uffee\025\uffee\001\002" +
    "\000\010\014\uffec\021\uffec\025\uffec\001\002\000\010\014" +
    "\013\021\016\025\012\001\002\000\010\013\020\014\022" +
    "\022\ufffd\001\002\000\004\023\036\001\002\000\010\014" +
    "\013\021\016\025\012\001\002\000\012\014\ufffb\021\ufffb" +
    "\024\ufffb\025\ufffb\001\002\000\012\014\013\021\016\024" +
    "\044\025\012\001\002\000\010\012\042\013\020\014\022" +
    "\001\002\000\012\014\ufffa\021\ufffa\024\ufffa\025\ufffa\001" +
    "\002\000\012\014\ufffc\021\ufffc\024\ufffc\025\ufffc\001\002" +
    "\000\006\002\ufffe\020\045\001\002\000\004\023\047\001" +
    "\002\000\004\002\001\001\002\000\010\014\013\021\016" +
    "\025\012\001\002\000\012\014\013\021\016\024\051\025" +
    "\012\001\002\000\004\002\uffff\001\002\000\026\004\ufff7" +
    "\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7\013" +
    "\ufff7\014\ufff7\022\ufff7\001\002\000\006\021\016\025\012" +
    "\001\002\000\006\021\016\025\012\001\002\000\026\004" +
    "\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4" +
    "\013\ufff4\014\ufff4\022\ufff4\001\002\000\026\004\ufff5\005" +
    "\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5" +
    "\014\ufff5\022\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\010\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\004\014\005\010" +
    "\006\007\007\013\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\010\006\051\001\001" +
    "\000\002\001\001\000\004\011\032\001\001\000\010\004" +
    "\016\005\010\006\007\001\001\000\002\001\001\000\006" +
    "\005\010\006\023\001\001\000\002\001\001\000\006\005" +
    "\010\006\022\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\004\033\005\010\006\007\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\002\037\003\036\004\040\005\010" +
    "\006\007\001\001\000\002\001\001\000\012\003\042\004" +
    "\040\005\010\006\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\045\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\002\047\003\036" +
    "\004\040\005\010\006\007\001\001\000\012\003\042\004" +
    "\040\005\010\006\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\005\010\006\055\001\001\000\006\005" +
    "\010\006\054\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


            
    public void defineErro(int linha, int coluna, String texto)
    {
        scanner.Scanner sc = (scanner.Scanner) this.getScanner();
        sc.defineErro(linha, coluna, texto);
    }
    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // if ::= KW_IF ABREPAR condicao FECHAPAR ABRECHAVE expr_list FECHACHAVE else 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("if",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= if EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double start_val = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // else ::= KW_ELSE ABRECHAVE expr_list FECHACHAVE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("else",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // else ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("else",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // condicao ::= expr op_Relacional expr 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicao",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr_list ::= expr_list expr_ptv 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr_list ::= expr_ptv 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr_ptv ::= expr PTVIRG 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_ptv",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr MAIS term 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr MENOS term 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= MENOS term 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= term 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // term ::= factor MULT term 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // term ::= factor DIV term 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(t == 0)
                       {
                            parser.defineErro(tleft, tright, "Divisao por zero.");
                       }
                       RESULT = f/t;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // term ::= factor 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = f; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // factor ::= NUMBER 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // factor ::= ABREPAR expr FECHAPAR 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // op_Relacional ::= MAIOR 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_Relacional",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // op_Relacional ::= MENOR 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_Relacional",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // op_Relacional ::= MAIORIGUAL 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_Relacional",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // op_Relacional ::= MENORIGUAL 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_Relacional",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // op_Relacional ::= IGUALIGUAL 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_Relacional",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // op_Relacional ::= DIF 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_Relacional",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}