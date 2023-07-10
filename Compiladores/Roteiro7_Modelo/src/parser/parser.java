
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

package parser;

import java_cup.runtime.*;
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
    "\000\017\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\007\002\000\002\003\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\004\000\002\004\003\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\003\000\002\006\003\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\010\006\010\012\013\014\007\001\002\000" +
    "\012\002\uffff\006\uffff\012\uffff\014\uffff\001\002\000\012" +
    "\004\ufff9\005\ufff9\006\ufff9\013\ufff9\001\002\000\020\004" +
    "\ufff5\005\ufff5\006\ufff5\007\030\010\031\011\027\013\ufff5" +
    "\001\002\000\020\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010" +
    "\ufff4\011\ufff4\013\ufff4\001\002\000\006\012\013\014\007" +
    "\001\002\000\012\002\025\006\010\012\013\014\007\001" +
    "\002\000\010\004\ufffe\005\016\006\017\001\002\000\010" +
    "\006\010\012\013\014\007\001\002\000\010\005\016\006" +
    "\017\013\015\001\002\000\020\004\ufff3\005\ufff3\006\ufff3" +
    "\007\ufff3\010\ufff3\011\ufff3\013\ufff3\001\002\000\006\012" +
    "\013\014\007\001\002\000\006\012\013\014\007\001\002" +
    "\000\012\004\ufffb\005\ufffb\006\ufffb\013\ufffb\001\002\000" +
    "\012\004\ufffc\005\ufffc\006\ufffc\013\ufffc\001\002\000\004" +
    "\004\023\001\002\000\012\002\ufffd\006\ufffd\012\ufffd\014" +
    "\ufffd\001\002\000\012\002\001\006\001\012\001\014\001" +
    "\001\002\000\004\002\000\001\002\000\012\004\ufffa\005" +
    "\ufffa\006\ufffa\013\ufffa\001\002\000\006\012\013\014\007" +
    "\001\002\000\006\012\013\014\007\001\002\000\006\012" +
    "\013\014\007\001\002\000\012\004\ufff7\005\ufff7\006\ufff7" +
    "\013\ufff7\001\002\000\012\004\ufff8\005\ufff8\006\ufff8\013" +
    "\ufff8\001\002\000\012\004\ufff6\005\ufff6\006\ufff6\013\ufff6" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\014\002\010\003\003\004\011\005\004\006" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\025\006\005\001" +
    "\001\000\012\003\023\004\011\005\004\006\005\001\001" +
    "\000\004\007\021\001\001\000\010\004\013\005\004\006" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\020\006\005\001\001\000\006\005\017\006\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\005\033\006\005\001\001\000\006" +
    "\005\032\006\005\001\001\000\006\005\031\006\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
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
          case 0: // expr_list ::= expr_list expr_ptv 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_ptv 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 System.out.println("= " + e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_ptv ::= expr NT$0 PTVIRG 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_ptv",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr MAIS term 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			
				System.out.print("+ ");
				RESULT = e + t; 
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MENOS term 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				System.out.print("- ");
				RESULT = e - t;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= MENOS term 
            {
              Double RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				System.out.print("u- ");
				RESULT = -t;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= term 
            {
              Double RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				RESULT = new Double(t.doubleValue());
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // term ::= factor MULT term 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
				System.out.print("* ");
				RESULT = f * t;  
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // term ::= factor DIV term 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
				System.out.print("/ ");
				RESULT = f / t;  
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // term ::= factor MOD term 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                                System.out.println("%");
                                RESULT = f %t;
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // term ::= factor 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				RESULT = new Double(f.doubleValue());
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // factor ::= NUMBER 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
				System.out.print(n + " "); 
				RESULT = new Double(n.doubleValue());
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // factor ::= ABRE_PARENT expr FECHA_PARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
				RESULT = new Double(e.doubleValue());
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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