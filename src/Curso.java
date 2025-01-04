import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Adicionando atributos
    private String nomeCurso;
    private Professor professor;
    private List<Aluno> alunoList = new ArrayList<>();

    //Adicionando curso
    public Curso(String nomeCurso, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;
    }

    //Adicionar alunos
    public void adicionarAluno(Aluno aluno) {
        alunoList.add(aluno);
    }
}
