package notificacao;

import modelo.Aluno;

public class NotificadorEMAIL implements INotificador{
    @Override
    public void notificar(Aluno aluno, String mensagem) {
        System.out.println("Notificando "+ aluno.getNome()
                          + " por SMS através do email "+ aluno.getEmail()+": "
                          + mensagem);
    }

}
