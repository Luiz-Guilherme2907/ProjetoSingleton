public class Main {
    Escrita escrita;
    Logger logger;

    public Main() {
        escrita = Escrita.getInstance();
        logger = Logger.getInstance();
    }

    public String menu() {
        escrita.write("1. LIST  |  2. CREATE  |  3. UPDATE  |  4. DELETE  |  5. EXIT", true);
        return escrita.read(">");
    }

    public void run() {
        String stopCondition;
        do {
               stopCondition = menu();
            switch (stopCondition) {
                case "1":
                    OperationFactory.getOperation("GET").run();
                    break;
                case "2":
                    OperationFactory.getOperation("INSERT").run();
                    break;
                case "3":
                    OperationFactory.getOperation("UPDATE").run();
                    break;
                case "4":
                    OperationFactory.getOperation("DELETE").run();
                    break;
                default:
                    escrita.write("Opção inválida", true);
                    logger.write("Opção " + stopCondition + " inválida!");
                    break;
            }

        } while (!stopCondition.equals("5"));
        escrita.close();
        logger.write("Finalizando sistema...");
    }

    public static void main(String[] arguments) {
        (new Main()).run();
    }
}
