public class DeleteAluno implements Operation {

    @Override
    public void run() {
        Data data = Data.getInstance();
        Escrita escrita = Escrita.getInstance();
        Logger logger = Logger.getInstance();
        try {
            int id = Integer.parseInt(escrita.read("ID do usuário para excluir:"));
            data.delete(id);
        } catch (Exception e) {
            logger.write("ERRO: " + e.getMessage());
        }

    }

}
