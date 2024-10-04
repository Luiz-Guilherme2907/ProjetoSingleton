public class Aluno{
    private int id;
    private String matricula;
    private String curso;

    public Aluno(int id, String matricula, String curso) {
        this.id = id;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
