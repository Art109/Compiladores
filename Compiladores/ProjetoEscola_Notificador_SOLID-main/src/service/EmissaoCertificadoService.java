package service;

import modelo.Aluno;
import notificacao.NotificadorSMS;

public class EmissaoCertificadoService {
    

    public void emitir(Aluno aluno, String nomeCurso) {
        NotificadorSMS notificadorSMS = new NotificadorSMS();
		notificadorSMS.notificar(aluno, "Certificado do curso "
								+ nomeCurso + " foi emitido!");
	}
}
