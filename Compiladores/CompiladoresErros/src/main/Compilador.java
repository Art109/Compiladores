/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import erros.ListaErros;
import java.io.FileReader;

import scanner.Scanner;
import parser.Parser;

/**
 *
 * @author jose
 */
public class Compilador {

    public static void main(String[] args)
        throws Exception {     
       
            
        FileReader in = new FileReader("src/main/teste.txt");
        ListaErros listaErros = new ListaErros();

        //redefinimos o construtor de Scanner em scanner.flex, agora ele recebe uma listaErros vazia.
        Scanner scanner = new Scanner(in, listaErros);
        Parser parser = new Parser(scanner);

        parser.parse();
        if (!listaErros.hasErros()) {
            System.out.println("Sintaxe Correta");
        } else {
            System.out.println("Erros encontrados:");
            listaErros.dump();
        }

        /*
         FileInputStream in = new FileInputStream("teste01.txt");
         Scanner scanner = new Scanner(in);
        
         Parser parser = new Parser(scanner);
         try {
         parser.parse();
         System.out.println("Arquivo sem erros de sintaxe!");
         } catch (Exception e) {
         System.out.println("Erro de sintaxe:" + e);
         }*/
    }

}
