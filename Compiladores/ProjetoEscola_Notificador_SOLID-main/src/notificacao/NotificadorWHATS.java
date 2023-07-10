package notificacao;

import modelo.Aluno;

public class NotificadorWHATS implements INotificador {
    @Override
    public void notificar(Aluno aluno, String mensagem) {
        System.out.println("Notificando "+ aluno.getNome()
                          + " por WHATSAPP através do telefone "+ aluno.getTelefone()+": "
                          + mensagem);
    }

}
