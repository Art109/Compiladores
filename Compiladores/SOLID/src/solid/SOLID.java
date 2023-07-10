/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid;

import pagamento.IProcessadorPagamento;
import pagamento.ProcessadorPagamentoBoleto;
import pagamento.ProcessadorPagamentoCartao;

/**
 *
 * @author NOTEBOOK
 */
public class SOLID {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        IProcessadorPagamento processadorPag;
        
        processadorPag = new ProcessadorPagamentoCartao();
        processadorPag.realizarPagamento(30);
        
         processadorPag = new ProcessadorPagamentoBoleto();
        processadorPag.realizarPagamento(35);
        
    }
    
    
    
}
