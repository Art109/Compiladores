/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex;
import Erro.ListaErros;
import java.io.*;
import java.io.FileReader;
import parser.parser;
import scanner.Scanner;

/**
 *
 * @author NOTEBOOK
 */
public class Ex {

    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("teste.txt");
        ListaErros listaErros = new ListaErros();
        
        Scanner scanner = new Scanner(in, listaErros);
        parser parser = new parser(scanner);
        
        try {
            parser.parse();
            System.out.println("Arquivo sem erros de sintaxe!");
        } catch (Exception e) {
            System.out.println("Erro de sintaxe:" + e);
        }
    }


    
}
