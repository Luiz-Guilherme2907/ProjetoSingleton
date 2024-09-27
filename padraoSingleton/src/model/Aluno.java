package model;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    
   private static Aluno instance;

    Aluno(){
        super();
        this.matricula = "";
        this.curso = "";
    }

    public static Aluno getInstance() {
        if (instance == null) {
            instance = new Aluno();
        }
        return instance;
    }
}
