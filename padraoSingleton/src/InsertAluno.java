public class InsertAluno implements Operation {

    @Override
    public void run() {
        Data data = Data.getInstance();
        Escrita escrita = Escrita.getInstance();
        Logger logger = Logger.getInstance();
        try {
            int id = Integer.parseInt(escrita.read("ID"));
            String matricula = escrita.read("Matricula");
            String curso = escrita.read("curso");
            Aluno aluno = new Aluno(id, matricula, curso);
            data.post(aluno);
        } catch (Exception e) {
            logger.write("ERRO: " + e.getMessage());
        }
    }

}
