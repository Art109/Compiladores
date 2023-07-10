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

    public static void main(String[] args)   
      throws Exception {
        //Para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        //Para ler a entrada do arquivo  
        //FileReader in = new FileReader("teste.txt");
        //Scanner scanner = new Scanner(in);
        
        parser parser = new parser(scanner);
        try {
            parser.parse();
            System.out.println("Arquivo sem erros de sintaxe!");
        } catch (Exception e) {
            System.out.println("Erro de sintaxe:" + e);
        }
    }

    
}
