/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erros;

/**
 *
 * @author jose
 */    
    class Erro {

        int linha, coluna;
        String texto;
        
        //Sobrecarga do construtor
        Erro(){
            this.linha = -1;
            this.coluna = -1;
            this.texto = ""; 
        }

        //Sobrecarga do construtor
        Erro(int linha, int coluna, String texto) {
            this.linha = linha;
            this.coluna = coluna;
            this.texto = texto;
        }
        
        //Sobrecarga do construtor
        Erro(int linha, int coluna) {
            this.linha = linha;
            this.coluna = coluna;
            this.texto = null;//"Erro não definido";                    
        }
        
        public void imprime(){
            String t = "";
            
            if(linha == -1 && coluna == -1){
                if(texto == null)
                    t = "linha=-1 coluna=-1  erro indefinido!";
                else
                    t = "linha=-1 coluna=-1  "+ texto;            
            }else{
                t =  "linha=" + (linha + 1) + " coluna=" + (coluna) + "  " + texto;
                
            }
            System.out.println(t);
        }
        
    }
