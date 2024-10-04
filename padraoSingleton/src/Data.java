import java.util.ArrayList;
import java.util.List;

public class Data {
    private static Data instance;
    private List<Aluno> alunos;

    private Data() {
        alunos = new ArrayList<>();
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    public List<Aluno> get() {
        return alunos;
    }

    public Aluno get(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    public void post(Aluno aluno) {
        if (get(aluno.getId()) != null) {
            return;
        }
        alunos.add(aluno);
    }

    public void update(Aluno aluno) {
        Aluno u = get(aluno.getId());
        if (u != null) {
            u.setMatricula(aluno.getMatricula());
            u.setCurso(aluno.getCurso());
        }
    }

    public void delete(int id) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId() == id) {
                alunos.remove(i);
                return;
            }
        }
    }

}
