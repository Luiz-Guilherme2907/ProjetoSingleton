public class UpdateAluno implements Operation {

    @Override
    public void run() {
        Data data = Data.getInstance();
        Escrita escrita = Escrita.getInstance();
        Logger logger = Logger.getInstance();
        try {
            int id = Integer.parseInt(escrita.read("ID do usuário para alterar:"));
            String matricula = escrita.read("MATRICULA: ");
            String curso = escrita.read("CURSO");
            Aluno aluno = new Aluno(id, matricula, curso);
            data.update(aluno);
        } catch (Exception e) {
            logger.write("ERRO: " + e.getMessage());
        }
    }
    
}
