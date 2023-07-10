package service;

import modelo.Aluno;
import notificacao.INotificador;

public class AtivacaoMatriculaService {

	private INotificador iNotificador;

	public AtivacaoMatriculaService(INotificador iNotificador) {
		this.iNotificador = iNotificador;
	}

	public void ativar(Aluno aluno) {
		aluno.ativar();

		// NotificadorSMS notificadorSMS = new NotificadorSMS();
		iNotificador.notificar(aluno, "Sua matrícula está ativa!");
	}

}