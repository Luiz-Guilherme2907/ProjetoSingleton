public class OperationFactory {
    public static Operation getOperation(String tipo) {
        if (tipo.equals("GET")) {
            return new ListAluno();
        }
        if (tipo.equals("INSERT")) {
            return new InsertAluno();
        }
        if (tipo.equals("UPDATE")) {
            return new UpdateAluno();
        }
        if (tipo.equals("DELETE")) {
            return new DeleteAluno();
        }
        return null;
    }

}
