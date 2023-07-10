/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erro;

/**
 *
 * @author NOTEBOOK
 */
public class Erro {
 
    private int linha,coluna;
    private String texto;
    
    
    public Erro(){
            this.linha = -1;
            this.coluna = -1;
            this.texto = ""; 
    }
    
    public Erro(int l, int c, String texto){
        this.linha = l ;
        this.coluna = c;
        this.texto = texto;
    }
    
    public Erro(int l, int c){
        this.linha = l ;
        this.coluna = c;
        this.texto = null;
    }
    
    public void imprime()
    {
        
        String aux = "";
        
        aux =  "linha: " + this.linha + " coluna: " + this.coluna + ", " ;
        
        if(texto == null)
        {
            aux += "Erro indefindo";
        }
        else
        {
            aux += this.texto;
        }
        
        System.out.println(aux);
    }
    
    public String getTexto()
    {
        return this.texto;
    }
    
    public void setTexto(String texto)
    {
        this.texto = texto;
    }
}
