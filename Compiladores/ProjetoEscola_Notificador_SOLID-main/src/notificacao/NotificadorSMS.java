package notificacao;

import modelo.Aluno;

public class NotificadorSMS implements INotificador {

    @Override
    public void notificar(Aluno aluno, String mensagem) {
        System.out.println("Notificando "+ aluno.getNome()
                          + " por SMS através do telefone "+ aluno.getTelefone()+": "
                          + mensagem);
    }

}
