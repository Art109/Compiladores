import modelo.Aluno;
import notificacao.INotificador;
import notificacao.NotificadorEMAIL;
import notificacao.NotificadorWHATS;
import service.AtivacaoMatriculaService;
import service.EmissaoCertificadoService;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno01 = new Aluno("Jose", "jose@ifet.com", "32-9999-9999");
        Aluno aluno02 = new Aluno("Maria", "maria@ifet.com", "32-8888-8888");

        INotificador iNotificador = new NotificadorWHATS();
        AtivacaoMatriculaService ativarMatricula = new AtivacaoMatriculaService(iNotificador);
        ativarMatricula.ativar(aluno01);
        ativarMatricula.ativar(aluno02);

        EmissaoCertificadoService emitirCertificado = new EmissaoCertificadoService();
        emitirCertificado.emitir(aluno01, "O.O.");
        emitirCertificado.emitir(aluno02, "O.O.");

    }
}
