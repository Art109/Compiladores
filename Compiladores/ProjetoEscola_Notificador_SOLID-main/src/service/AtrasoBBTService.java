package service;

import modelo.Aluno;
import notificacao.NotificadorSMS;

public class AtrasoBBTService {
    

    public void informaAtraso(Aluno aluno) {

        NotificadorSMS notificadorSMS = new NotificadorSMS();
		notificadorSMS.notificar(aluno, "Você está em atraso com a Biblioteca");
	}
}
