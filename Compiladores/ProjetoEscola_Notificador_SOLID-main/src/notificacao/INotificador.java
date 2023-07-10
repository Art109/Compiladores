package notificacao;

import modelo.Aluno;

public interface INotificador {

    void notificar(Aluno aluno, String mensagem);
}