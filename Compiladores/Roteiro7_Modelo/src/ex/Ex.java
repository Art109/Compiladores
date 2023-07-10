

import java.io.*;
import java.io.FileInputStream;
import parser.parser;
import scanner.Scanner;

import parser.parser;


/**
 *
 * @author NOTEBOOK
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    static public void main(String argv[])throws Exception { 
        System.out.println("TUDO CERTO");
				try {
                                    FileReader in = new FileReader("teste.txt");
                                    parser p = new parser(new Scanner(in));
                                    Object result = p.parse().value;     
				} catch (Exception e) {
                                    e.printStackTrace();
				}
		}

    
}
