/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author NOTEBOOK
 */
public class ProcessadorPagamentoCartao implements IProcessadorPagamento {



    @Override
    public void realizarPagamento(float valor) {
        System.out.println("Pagamento realizado com sucesso via Cartao no valor " + valor + " R$");
    }
    
}
