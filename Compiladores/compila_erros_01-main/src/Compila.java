import parser.Parser;
import scanner.Scanner;

import java.io.FileReader;

public class Compila {
    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("teste01.txt");

        //redefinimos o construtor de Scanner em scanner.flex, agora ele recebe uma listaErros vazia.
        Scanner scanner = new Scanner(in);
        Parser parser = new Parser(scanner);
        
        try {
            parser.parse();
            System.out.println("Arquivo sem erros de sintaxe!");
        } catch (Exception e) {
            System.out.println("Erro de sintaxe:" + e);
        }
    }
}
