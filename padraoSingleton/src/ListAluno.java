import java.util.List;

public class ListAluno implements Operation {

    @Override
    public void run() {
        Escrita escrita = Escrita.getInstance();
        Data data = Data.getInstance();
        Logger logger = Logger.getInstance();

        List<Aluno> alunos = data.get();

        if (alunos.size() <= 0) {
            logger.write("Listando, mas não existe nada cadastrado ainda.");
            return;
        }
        escrita.write("" + alunos.size(), true);
        escrita.write("+-----------+--------------------------+--------------------------+", true);
        escrita.write("| ID        |          NOME            |         E-MAIL           |", true);
        escrita.write("+-----------+--------------------------+--------------------------+", true);
        for (Aluno aluno : alunos) {
            escrita.write(
                    String.format("| %-9d | %-24s | %-24s |",
                            aluno.getId(),
                            aluno.getMatricula(),
                            aluno.getCurso()),
                    true);
        }
        escrita.write("+-----------+--------------------------+--------------------------+", true);
    }
}
