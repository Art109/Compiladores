package erros;

import java.util.ArrayList;
import java.util.List;

public class ListaErros {

    private List<Erro> erros = null;    

    public ListaErros() {
        this.erros = new ArrayList<Erro>();        
    }            

    public void defineErro(int linha, int coluna, String texto) {
        Erro e = new Erro(linha, coluna, texto);
        this.erros.add(e);        
    }

    //sobrecarga do metodo defErro
    public void defineErro(int linha, int coluna) {
        Erro e = new Erro(linha, coluna);        
        this.erros.add(e);
    }

    //Adiciona o texto em todos erros que estiverem sem descricao
    public void defineErro(String texto) {
        for (Erro e: this.erros){
            if (e.texto == null) {
                e.texto = texto;
                return;
            }
        }
    }

    /**
     * Imprime erro por erro
     */
    public void dump() {
        for (Erro e: this.erros) {            
            e.imprime();            
        }
    }
    
    public boolean hasErros(){
        if(this.erros.size() > 0){
            return true;
        }else{
            return false;
        }
    }
        

}
