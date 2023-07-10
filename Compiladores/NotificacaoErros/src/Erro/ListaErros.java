/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
public class ListaErros {
    
    
    private List<Erro> erros = null;    

    public ListaErros() {
        this.erros = new ArrayList<Erro>();        
    }   

    
    public void defineErro(int l, int c, String texto){
        Erro e = new Erro(l,c,texto);
        this.erros.add(e);
    }
    
    public void defineErro(int l, int c){
        Erro e = new Erro(l, c);
        this.erros.add(e);
    }
    
    public void defineErro(String texto){
       for(Erro e : this.erros)
       {
           if(e.getTexto() == null)
           {
               e.setTexto(texto);
               return;
           }
       }
    }
    
    public void dump()
    {
       for(Erro e : this.erros)
       {
           e.imprime();
       }
    }
}
