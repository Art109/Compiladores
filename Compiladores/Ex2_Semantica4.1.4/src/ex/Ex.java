/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex;
import java.io.*;
import java.io.FileInputStream;
import parser.parser;
import scanner.Scanner;

/**
 *
 * @author NOTEBOOK
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    static public void main(String argv[]) { 
        System.out.println("TUDO CERTO");
				try {
						Scanner sc = new Scanner(System.in);
						parser p = new parser(sc);
			      Object result = p.parse().value;     
				} catch (Exception e) {
						e.printStackTrace();
				}
		}

    
}
